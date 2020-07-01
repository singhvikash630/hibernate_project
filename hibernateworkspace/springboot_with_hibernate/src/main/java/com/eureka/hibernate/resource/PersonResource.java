package com.eureka.hibernate.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.eureka.hibernate.entity.Person;
import com.eureka.hibernate.entity.User;
import com.eureka.hibernate.service.PersonService;

@RestController
public class PersonResource {
	@Autowired
	private PersonService service;
	
	/* ############## API using hibernate crud operation #####*/ 

	@PostMapping("/savePerson")
	public String save(@RequestBody Person person) {
		service.save(person);
		return "success";
	}

	@GetMapping("/getPersons")
	public List<Person> getAllPersons(@RequestBody Person person) {
		return service.getPersons();
	}
	
	/* ###################### END ################################ */
	
	/* ############## API using hibernate one-to-one Association #####*/ 

	@PostMapping("/saveUser")
	public String saveUser(@RequestBody User user) {
		service.save(user);
		return "success";
	}

	@GetMapping("/getUsers")
	public List<User> getUsers() {
		return service.getUsers();
	}
	
	/* ###################### END ################################ */
	
}
