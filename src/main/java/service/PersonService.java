package service;

import entity.Person;

import java.util.List;

public interface PersonService {
    void add(Person person);
    List<Person> listUsers();
    void removePerson(int id);
    Person lookPerson(int id);
}
