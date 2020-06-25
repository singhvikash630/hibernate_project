package com.jspider.hibernate.commons;

import javax.transaction.SystemException;
import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jspider.hibernate.beans.Student;

public class Hibernatetransaction {

	public static void main(String[] args)
	{
		Configuration config=new Configuration();
		config.configure();
		
		SessionFactory factory=config.buildSessionFactory();
		
		Session s1=factory.openSession();
		org.hibernate.Transaction transaction=s1.beginTransaction();
		
		try{
		//DB insert opearation
				Student stdobj=new Student();
				stdobj.setRegno(6);
				stdobj.setFname("aaaa");
				stdobj.setLname("bbbbb");
				stdobj.setMname("ccccc");
				//int i=100/0;
				System.out.println("saving the student record...");
				s1.save(stdobj);
				s1.flush();
				System.out.println("saved the student record");	
				System.out.println("committing the transaction");
				transaction.commit();
				s1.close();
		}
		catch(Exception e)
		{
			System.out.println("error occured!!!rolling back transaction");
			transaction.rollback();
			s1.close();
		}
				
		
	}

}
