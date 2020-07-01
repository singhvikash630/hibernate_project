package com.eureka.hibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eureka.hibernate.dao.PersonDao;
import com.eureka.hibernate.entity.Person;
import com.eureka.hibernate.entity.User;

@Service
public class PersonService {

	@Autowired
	private PersonDao dao;

	public void save(Person person) {
		dao.savePerson(person);
	}

	public List<Person> getPersons() {
		return dao.getPersons();
	}
	
	public void save(User user) {
		dao.saveUser(user);
	}

	public List<User> getUsers() {
		return dao.getUsers();
	}
}
