package com.jspider.hibernate.commons;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.jspider.hibernate.beans.Student;

public class TestHibernate
    {
	public static void main(String[] args)
	{
		//load the configuration file
		Configuration config=new Configuration();
		config.configure();
		
		//create the session factory
		//SessionFactory factory=new Configuration().configure().buildSessionFactory();
		
		SessionFactory factory=config.buildSessionFactory();
		//open session
		Session s1=factory.openSession();
		
		//operate with DB via hibernate
		//DB insert opearation
				Student stdobj=new Student();
				stdobj.setRegno(1);
				stdobj.setFname("vikash");
				stdobj.setLname("singh");
				stdobj.setMname("kumar");
				System.out.println("saving the student record...");
				s1.save(stdobj);
				s1.flush();
				System.out.println("saved the student record");
				s1.close();
		
		
		
		//DB insert opearation
		/*Student stdobj=new Student();
		stdobj.setRegno(5);
		stdobj.setFname("aaaa");
		stdobj.setLname("bbbbb");
		stdobj.setMname("ccccc");
		System.out.println("saving the student record...");
		s1.save(stdobj);
		s1.flush();
		System.out.println("saved the student record");
		s1.close();*/	
		
		/*//DB update opearation
				Student stdobj=new Student();
				stdobj.setRegno(5);
				stdobj.setFname("sahil");
				stdobj.setLname("singh");
				stdobj.setMname("kumar");
				System.out.println("saving the student record...");
				s1.update(stdobj);
				s1.flush();
				System.out.println("saved the student record");
				s1.close();*/
		
		/*//DB select opearation
		int regno=5;
		Student stdobj=(Student)s1.get(Student.class,regno);
		//Student stdobj=(Student)s1.load(Student.class,regno);
		if(stdobj==null)
		{
			System.out.println("Regno"+regno+"doesn't exist");
		}
		else
		{
		    System.out.println("Regno exist");
		    System.out.println("Regno:"+stdobj.getRegno());
			System.out.println("Fname:"+stdobj.getFname());
			System.out.println("Mname:"+stdobj.getMname());
			System.out.println("Lname:"+stdobj.getLname());
		}
		s1.close();
		
		//DB delete opearation
				Student stdobj=new Student();
				stdobj.setRegno(5);
				System.out.println("deleting the student record");
				s1.delete(stdobj);
				s1.flush();
				System.out.println("deleted the student record");
				s1.close();  */
		}
}
