package by.sterlikov.jspexample.service;

import by.sterlikov.jspexample.model.Person;

import java.sql.*;


public class DbPersonServiceImpl implements DbPersonService {
    @Override
    public void saveDb(Person person,Connection connection)  {
        String query = "INSERT INTO Persons(name,age) VALUES (?,?)";
            try  {
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1, "name");
                preparedStatement.setString(2, "age");
                preparedStatement.executeUpdate();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
    }
}
