package by.sterlikov.jspexample.service;

import by.sterlikov.jspexample.model.Person;

import java.util.List;

public interface PersonService {
    public void save(Person person);
    public List<Person> findAll();
    public List<Person> findByName(String name);


}
