package com.jspider.hibernate.commons;

//import java.io.Serializable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.jspider.hibernate.beans.Course;
import com.jspider.hibernate.beans.PhoneNumber;
import com.jspider.hibernate.beans.Student;
import com.jspider.hibernate.beans.Users;

public class HibernateOneToMany 
{

	public static void main(String[] args)
	{
		Configuration config=new Configuration();
		config.configure();
		SessionFactory factory=config.buildSessionFactory();
		Session session=factory.openSession();
		/*
		 * Many-to-One:save
		 */
		
		/*Student student=null;Users users=null;Course course=null;PhoneNumber number=null;
		Set<PhoneNumber> phoneNumbers=new HashSet<PhoneNumber>();
		int regno=4;int courseid=2;		
		student=new Student();
		student.setRegno(regno);
		student.setFname("monu");
		student.setMname("kumar");
		student.setLname("singh");
		
		
		users=new Users();
		users.setRegno(regno);
		student.setUsers(users);
		
		course=new Course();
		course.setCourseId(courseid);
		//course.setCourseName("j2ee");
		//session.save(course);
		student.setCourse(course);
		
		number=new PhoneNumber();
		number.setRegno(regno);
		number.setNumbertype("mobile");
		number.setNumber(889223);
		phoneNumbers.add(number);
		
		number=new PhoneNumber();
		number.setRegno(regno);
		number.setNumbertype("landline");
		number.setNumber(444444444);
		phoneNumbers.add(number);
		
		student.setPhoneNumbers(phoneNumbers);
		
		session.save(student);		
		session.flush();
		session.close();
*/
		/*
		 * Many-to-One:select
		*/
		/*int regno=4;
		Student student=(Student)session.get(Student.class, regno);
		System.out.println("Fname:"+student.getFname());
		
		Users users=student.getUsers();
		System.out.println("Password:"+users.getPassword());
		
		Course course=student.getCourse();
		System.out.println("CourseName:"+course.getCourseName());
		
		Set<PhoneNumber> phoneNumber=student.getPhoneNumbers();
		Iterator<PhoneNumber> iterator=phoneNumber.iterator();
		while(iterator.hasNext())
		{
			PhoneNumber number=iterator.next();
			System.out.println("Regno:"+number.getRegno());
			System.out.println("NumberType:"+number.getNumbertype());
			System.out.println("Number:"+number.getNumber());
			
		}
		*/
		/*
		 * One-to-Many:update
		*/
		/*Student student=null;Users users=null;Course course=null;PhoneNumber number=null;
		Set<PhoneNumber> phoneNumbers=new HashSet<PhoneNumber>();
		int regno=4;int courseid=2;		
		student=new Student();
		student.setRegno(regno);
		student.setFname("monuuuee");
		student.setMname("kumarrree");
		student.setLname("singhhree");
		
		
		users=new Users();
		users.setRegno(regno);
		users.setPassword("vi");
		student.setUsers(users);
		//no effect
		course=new Course();
		course.setCourseId(courseid);
		course.setCourseName("j2ee12");
		student.setCourse(course);
		
		number=new PhoneNumber();
		number.setRegno(regno);
		number.setNumbertype("mobile");
		number.setNumber(889221121);
		phoneNumbers.add(number);
		
		number=new PhoneNumber();
		number.setRegno(regno);
		number.setNumbertype("landline");
		number.setNumber(123451131);
		phoneNumbers.add(number);
		
		student.setPhoneNumbers(phoneNumbers);
		
		session.update(student);		
		session.flush();
		session.close();
		*/
		/*
		 * One-to-Many:delete
		*/
		Student student=null;Users users=null;Course course=null;PhoneNumber number=null;
		Set<PhoneNumber> phoneNumbers=new HashSet<PhoneNumber>();
		int regno=4;int courseid=2;		
		
		student=new Student();
		student.setRegno(regno);
		
		users=new Users();
		users.setRegno(regno);
		student.setUsers(users);
		
		course=new Course();
		course.setCourseId(courseid);
		student.setCourse(course);
		
		number=new PhoneNumber();
		number.setRegno(regno);
		number.setNumbertype("mobile");
		phoneNumbers.add(number);
		
		student.setPhoneNumbers(phoneNumbers);
		
		session.delete(student);
		session.flush();
		session.close();
		
		
		
		
		
}

}
