package com.eureka.hibernate.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.eureka.hibernate.entity.Person;
import com.eureka.hibernate.entity.User;

@Repository
@Transactional
public class PersonDao {

	@Autowired
	SessionFactory factory;

	public void savePerson(Person person) {
		getSession().save(person);
	}

	@SuppressWarnings({ "unchecked", "deprecation" })
	public List<Person> getPersons() {
		return getSession().createCriteria(Person.class).list();
	}
	
	public void saveUser(User user) {
		getSession().save(user);
	}

	@SuppressWarnings({ "unchecked", "deprecation" })
	public List<User> getUsers() {
		return getSession().createCriteria(User.class).list();
	}

	private Session getSession() {
		Session session = factory.getCurrentSession();
		if (session == null) {
			session = factory.openSession();
		}
		return session;
	}
}
