package navin.com.java.JDBC.service;

import navin.com.java.JDBC.model.Students;

import java.sql.*;

public class StudentService {

    public void save(Connection connection){
        String sql = "INSERT INTO students(name, gender, grade) VALUES('Vanes','M',1)";
        try (Statement statement = connection.createStatement()) {
            statement.executeUpdate(sql);
            System.out.println("Insert Successfully");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void saveStudent(Students students,Connection connection){
        String sql = "INSERT INTO students(name,gender,grade) VALUES(?,?,?)";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1,students.getName());
            preparedStatement.setString(2,students.getGender());
            preparedStatement.setInt(3,students.getGrade());
            preparedStatement.executeUpdate();
            System.out.println("Insert Successfully");
        } catch (SQLException e) {
            e.printStackTrace();
//            throw new RuntimeException(e);
        }
    }

    public Students findById(int stuId ,Connection connection){
        String sql = "SELECT id, name, gender, grade FROM students WHERE id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1,stuId);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    Students student = new Students(
                            resultSet.getString("name"),
                            resultSet.getString("gender"),
                            resultSet.getInt("grade")
                    );
                    student.setId(resultSet.getInt("id"));
                    return student;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
