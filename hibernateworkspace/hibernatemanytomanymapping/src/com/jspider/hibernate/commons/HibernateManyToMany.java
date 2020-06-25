package com.jspider.hibernate.commons;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jspider.hibernate.beans.InterviewDetails;
import com.jspider.hibernate.beans.Student;

public class HibernateManyToMany {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure()
				.buildSessionFactory();
		Session session = factory.openSession();

		Student student = new Student();
		student.setRegno(1);
		student.setFname("ankesh");
		student.setMname("kumar");
		student.setLname("singh");

		Set interviewDetails = new HashSet();
		InterviewDetails interviewDetail1 = new InterviewDetails();
		interviewDetail1.setId(13);
		interviewDetail1.setCompanyName("tcs");
		interviewDetail1.setTechnology("java");
		interviewDetail1.setLocation("Bangalore");
		interviewDetails.add(interviewDetail1);

		InterviewDetails interviewDetail2 = new InterviewDetails();
		interviewDetail2.setId(12);
		interviewDetail2.setCompanyName("wipro");
		interviewDetail2.setTechnology(".net");
		interviewDetail2.setLocation("delhi");
		interviewDetails.add(interviewDetail2);

		student.setInterviewDetails(interviewDetails);

		session.save(student);
		session.flush();
		session.close();

	}

}
