package by.sterlikov.jspexample.service;

import by.sterlikov.jspexample.model.Person;

import java.sql.Connection;

public interface DbPersonService {
    public void saveDb(Person person, Connection connection) throws ClassNotFoundException;
}
