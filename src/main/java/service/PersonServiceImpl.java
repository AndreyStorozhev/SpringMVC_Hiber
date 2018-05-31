package service;

import dao.PersonDao;
import entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonDao personDao;

    @Override
    @Transactional
    public void add(Person person) {
        personDao.add(person);
    }

    @Override
    @Transactional
    public List<Person> listUsers() {
        return personDao.listUsers();
    }

    @Override
    @Transactional
    public void removePerson(int id) {
        personDao.removePerson(id);
    }

    @Override
    @Transactional
    public Person lookPerson(int id) {
        return personDao.lookPerson(id);
    }
}
