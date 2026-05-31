package navin.com.java;

import navin.com.java.model.Student;
import navin.com.java.service.StudentService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import static navin.com.java.config.DBConnection.getConnection;

public class Main {

    private static StudentService studentService = new StudentService();
    private static Connection connection;

    public Main() {
        studentService = new StudentService();
        connection = getConnection();
    }

    public static void main(String[] args) {

        Main main = new Main();

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== STUDENT MENU =====");
            System.out.println("1. Save Student");
            System.out.println("2. Find Student");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. List All Students");
            System.out.println("6. Exit");

            System.out.print("Choose option: ");
            int option = scanner.nextInt();

            switch (option) {

                case 1:
                    scanner.nextLine();
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter gender: ");
                    String gender = scanner.nextLine();
                    System.out.print("Enter score: ");
                    int score = scanner.nextInt();
                    Student newStudent = new Student(name, gender, score);
                    studentService.saveStudent(newStudent, connection);
                    System.out.println("Saved Successfully!");
                    break;
                case 2:
                    System.out.print("Enter ID to find: ");
                    int idToFind = scanner.nextInt();
                    Student student = studentService.findById(idToFind, connection);
                    if (student != null) {
                        System.out.println(student);
                    }
                    break;
                case 3:
                    System.out.print("Enter ID to update: ");
                    int updateId = scanner.nextInt();
                    Student updateStudent = studentService.findById(updateId, connection);
                    if (updateStudent != null) {
                        scanner.nextLine();
                        System.out.print("Enter new name: ");
                        String newName = scanner.nextLine();
                        updateStudent.setName(newName);
                        studentService.updateStudent(updateStudent, connection);
                    } else {
                        System.out.println("Student not found!");
                    }
                    break;

                case 4:
                    System.out.print("Enter ID to delete: ");
                    int idToDelete = scanner.nextInt();
                    studentService.deleteStudent(idToDelete, connection);
                    break;
                case 5:
                    System.out.println("===== STUDENT LIST =====");
                    List<Student> allStudents = studentService.getAllStudent(connection);
                    for (Student s : allStudents) {
                        System.out.println(s);
                    }
                    break;
                case 6:
                    System.out.println("Program Exit...");
                    System.exit(0);
                default:
                    System.out.println("Invalid Option!");
            }
        }
    }
}