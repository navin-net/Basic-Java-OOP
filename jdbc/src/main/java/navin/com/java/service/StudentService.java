package navin.com.java.service;

import navin.com.java.model.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentService {


//    private Connection connection;
//
//    // Constructor
//    public StudentService(Connection connection) {
//        this.connection = connection;
//    }



    private Student getStudent(ResultSet resultSet) throws SQLException {
        int id = resultSet.getInt(1);
        String name = resultSet.getString(2);
        String gender = resultSet.getString(3);
        int grade = resultSet.getInt(4);

        return new Student(id, name, gender,grade);
    }

    public void save(Connection connection){

        String sql = "INSERT INTO students VALUES (1,'John', 'Male', 85)";
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
            System.out.println("Inert Successful");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void saveStudent(Student student, Connection connection){

        String sql = "INSERT INTO students(name,gender,grade) VALUES (?,?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,student.getName());
            preparedStatement.setString(2,student.getGender());
            preparedStatement.setInt(3,student.getGrade());
            preparedStatement.executeUpdate();
            System.out.println("Insert Successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public Student findById(int stuId, Connection connection) {
        String sql = "SELECT * FROM students WHERE id=?";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, stuId);

            ResultSet resultSet = preparedStatement.executeQuery();

            // Check if record exists
            if (resultSet.next()) {
//                int id = resultSet.getInt(1);
//                String name = resultSet.getString(2);
//                String gender = resultSet.getString(3);
//                int grade = resultSet.getInt(4);
//
//                return new Student(id, name, gender,grade);
                Student student = getStudent(resultSet);
                return  student;
            } else {
                System.out.println("Student ID not found!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public void updateStudent(Student student,Connection connection){

        int idtoFind = student.getId();
        Student studentFind = findById(idtoFind,connection);
        if (studentFind != null){
            String sql = "UPDATE students SET name=?, gender=?, grade=? WHERE id=?";
            PreparedStatement preparedStatement;
            try {
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1,student.getName());
                preparedStatement.setString(2,student.getGender());
                preparedStatement.setInt(3,student.getGrade());
                preparedStatement.setInt(4,idtoFind);
                preparedStatement.executeUpdate();
                System.out.println("Update Successfully");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }else {
            System.out.println("Student not found with id="+ idtoFind);
        }
    }


    public void deleteStudent(int idToDelete, Connection connection){
        Student studentFind = findById(idToDelete,connection);
        if (studentFind != null) {
            String sql = "DELETE FROM students WHERE id=?";
            try {
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setInt(1,idToDelete);
                preparedStatement.executeUpdate();
                System.out.println("Delete Successfully");

            } catch (SQLException e) {

            }
        }else {
            System.out.println("Student not found with id="+ idToDelete);
        }
    }




    public List<Student> getAllStudent(Connection connection){
        List<Student> students = new ArrayList<>();
        String sql = "SELECT * FROM students";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                Student student = getStudent(resultSet);
                students.add(student);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return students;
    }



























}
