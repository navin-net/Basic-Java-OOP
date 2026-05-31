package navin.com.java.JDBC;

import navin.com.java.JDBC.model.Students;
import navin.com.java.JDBC.service.StudentService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Demo {

    private final StudentService studentService;

    public Demo(){
        studentService = new StudentService();
    }

    public static void main(String[] args) {
        Demo demo = new Demo();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student id: ");
        int id = scanner.nextInt();

        Students student = demo.findById(id);
        if (student == null) {
            System.out.println("Output: Student not found with id " + id);
        } else {
            System.out.println("Output: " + student);
        }
    }

    private void save(String name,String gender, int grade){
        Students student = new Students(name, gender, grade);
        try (Connection connection = getConnection()) {
            if (connection == null) {
                return;
            }
            studentService.saveStudent(student,connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private Students findById(int id){
        try (Connection connection = getConnection()) {
            if (connection == null) {
                return null;
            }
            return studentService.findById(id, connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    private Connection getConnection(){
        try {
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://localhost:5432/postgres";
            String user = "postgres";
            String pwd = "";
            return DriverManager.getConnection(url,user,pwd);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Database connection failed!");
            e.printStackTrace();
        }
        return null;
    }
}
