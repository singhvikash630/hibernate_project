package com.jspider.hibernate.commons;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

import com.jspider.hibernate.beans.Student;

public class HibernateCriteriaQuery {

	public static void main(String[] args) 
	{
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		Object[] regno={7,2};
		Criteria criteria=session.createCriteria(Student.class);
		criteria.add(Restrictions.in("regno",regno));
		criteria.add(Restrictions.like("fname","ank",MatchMode.ANYWHERE));
		List<Object> results=criteria.list();
		for(Object rsltObj:results)
		{
			Student students=(Student)rsltObj;
			System.out.println("RegNo:"+students.getRegno());
			System.out.println("Fname:"+students.getFname());
			System.out.println("Mname:"+students.getMname());
			System.out.println("Lname:"+students.getLname());
		}
		
		
	}

}
