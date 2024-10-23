package ru.itsjava.jdbc.dao1;

import java.sql.*;

public class Employer1JdbcImpl1 implements Employer1Dao1 {
    public static final String DB_URL = "jdbc:MySql://localhost:3307/schema_online_course?serverTimezone=UTC";
    public static final String DB_LOGIN = "";
    public static final String DB_PASSWORD = "";
    @Override
    public int findAgeByName(String name) {
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_LOGIN, DB_PASSWORD);
             PreparedStatement preparedStatement=connection.prepareStatement("SELECT age FROM schema_online_course.employers1 where name = ?");
        ){
            preparedStatement.setString(1, "vova");
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            return resultSet.getInt("age");
        }
        catch(SQLException throwables){
            throwables.printStackTrace();
        }
        return -1;
    }
}
