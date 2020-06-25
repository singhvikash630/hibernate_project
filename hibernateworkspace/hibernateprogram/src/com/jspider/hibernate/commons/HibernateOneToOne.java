package com.jspider.hibernate.commons;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jspider.hibernate.beans.Student;
import com.jspider.hibernate.beans.Users;

public class HibernateOneToOne {
	public static void main(String[] args) 
	{
	Configuration config=new Configuration();
	config.configure();
	SessionFactory factory=config.buildSessionFactory();
	Session s1=factory.openSession();
	
	//one-to-one insert operation
	/*Student student=new Student();
	Users users=new Users();
	 int regno=9;
	student.setRegno(regno);
	student.setFname("sahil");
	student.setLname("singh");
	student.setMname("kumar");
	users.setPassword("vikash");
	users.setRegno(regno);
	student.setUsers(users);
	System.out.println("saving the records");
	s1.save(student);
	s1.flush();
	System.out.println("saved the records");
	s1.close();
	*/
	/*//one-to-one update operation
	  Student student=new Student();
	   Users users=new Users();
       int regno=9;
		student.setRegno(regno);
		student.setFname("sahill");
		student.setLname("singhh");
		student.setMname("kumarr");
		users.setPassword("vikashh");
		users.setRegno(regno);
		student.setUsers(users);
		System.out.println("updating the records");
		s1.update(student);
		s1.flush();
		System.out.println("updated the records");
		s1.close();
	*/
	
	/*//one-to-one select operation
			int regno=9;
			Student student=(Student)s1.get(Student.class, regno);
			if(student==null)
			{
				System.out.println("doesn't exist");
			}
			else
			{
				System.out.println("display the student record");
				System.out.println("Regno:"+student.getRegno());
				System.out.println("Fname:"+student.getFname());
				System.out.println("Mname:"+student.getMname());
				System.out.println("Lname:"+student.getLname());
				
				System.out.println("display the users record");
				Users users=student.getUsers();
				System.out.println("password:"+users.getPassword());
				System.out.println("IsAdmin:"+users.getIsadmin());
				
			}
			s1.close();
*/		
	
	//one-to-one delete operation
	int regno=8;
	Student student=new Student();
	Users users=new Users();
	student.setRegno(regno);
	users.setRegno(regno);
	student.setUsers(users);
	System.out.println("deleting the student records");
	s1.delete(student);
	s1.flush();
	System.out.println("deleted the student records");
	s1.close();

	
	}

}
