package com.jspider.hibernate.commons;

//import java.io.Serializable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.jspider.hibernate.beans.PhoneNumber;
import com.jspider.hibernate.beans.Student;

public class HibernateOneToMany {

	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.configure();
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();

		/*
		 * Many-to-One:save
		 */

		Student student = new Student();
		int regno = 5;
		student.setRegno(regno);
		student.setFname("chunnu");
		student.setMname("kumar");
		student.setLname("singh");

		HashSet numbers = new HashSet();
		PhoneNumber number1 = new PhoneNumber();
		number1.setId(2);number1.setNumbertype("mobile");number1.setNumber(666666);
		
		numbers.add(number1);
		PhoneNumber number2 = new PhoneNumber();
		number2.setId(6);number2.setNumbertype("phone");number2.setNumber(77777);
		numbers.add(number2);
		

		student.setPhoneNumbers(numbers);

		session.save(student);
		session.flush();
		session.close();

	}

}
