package dao;

import entity.Person;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonDaoImpl implements PersonDao {
    @Autowired
    private SessionFactory sessionFactory;

    private static final Logger logger = Logger.getLogger(PersonDaoImpl.class);

    @Override
    public void add(Person person) {
        sessionFactory.getCurrentSession().save(person);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Person> listUsers() {
        return (List<Person>) sessionFactory.getCurrentSession().createQuery("from Person order by id").list();
    }

    @Override
    public void removePerson(int id) {
        Session session = sessionFactory.getCurrentSession();
        Person person = session.load(Person.class, id);
        if (person != null)
            session.delete(person);
    }

    @Override
    public Person lookPerson(int id) {
        Session session = sessionFactory.getCurrentSession();
        Person person = session.load(Person.class, id);
        logger.info("PERSON look: " + person);
        return person;
    }
}
