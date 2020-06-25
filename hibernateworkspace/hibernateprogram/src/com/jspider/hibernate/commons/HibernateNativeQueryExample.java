package com.jspider.hibernate.commons;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.jspider.hibernate.beans.Student;
import com.jspider.hibernate.beans.Users;

public class HibernateNativeQueryExample {

	public static void main(String[] args)
	{
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		/*String sql1="select * from student";
		SQLQuery query=session.createSQLQuery(sql1);
		query.addEntity(Student.class);
		List<Object> results=query.list();
		for(Object objRes:results)
		{
			Student student=(Student) objRes;
			System.out.println("RegNo:"+student.getRegno());
			System.out.println("FirstName:"+student.getFname());
			System.out.println("Mastname:"+student.getMname());
			System.out.println("LastName:"+student.getLname());
		
		}
	*/
		
		/*String sql1="select * from student where regno>=:RegNo";
		SQLQuery query=session.createSQLQuery(sql1);
		query.setParameter("RegNo",5);
		query.addEntity(Student.class);
		List<Object> results=query.list();
		for(Object objRes:results)
		{
			Student student=(Student) objRes;
			System.out.println("RegNo:"+student.getRegno());
			System.out.println("FirstName:"+student.getFname());
			System.out.println("Mastname:"+student.getMname());
			System.out.println("LastName:"+student.getLname());
			Users users=student.getUsers();
			System.out.println("Password:"+users.getPassword());
			System.out.println("IsAdmin:"+users.getIsadmin());
		
		}
*/	
		/*String sql1="select fname from student";
		SQLQuery query=session.createSQLQuery(sql1);
		//query.setParameter("RegNo",5);
		//query.addEntity(Student.class);
		List<Object> results=query.list();
		for(Object objRes:results)
		{
			String FirstName=(String)objRes;
			System.out.println("FirstName:"+FirstName);
					
		}*/
		
		/*String sql1="select * from student s,users u where u.regno=s.regno and s.regno>=:RegNo";
		SQLQuery query=session.createSQLQuery(sql1);
		query.setParameter("RegNo",5);
		query.addEntity(Student.class);
		List<Object> results=query.list();
		for(Object objRes:results)
		{
			Student student=(Student) objRes;
			System.out.println("RegNo:"+student.getRegno());
			System.out.println("FirstName:"+student.getFname());
			System.out.println("Mastname:"+student.getMname());
			System.out.println("LastName:"+student.getLname());
			Users users=student.getUsers();
			System.out.println("Password:"+users.getPassword());
			System.out.println("IsAdmin:"+users.getIsadmin());
		
		}
*/
		
		String sql1="select s.fname from student s,users u where u.regno=s.regno and s.regno>=:RegNo";
		SQLQuery query=session.createSQLQuery(sql1);
		query.setParameter("RegNo",1);
		//query.addEntity(Student.class);
		List<Object> results=query.list();
		for(Object objRes:results)
		{
			String firstName=(String)objRes;
			System.out.println("RegNo:"+firstName);
			
		}

	}

}
