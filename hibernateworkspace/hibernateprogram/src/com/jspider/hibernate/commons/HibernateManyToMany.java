package com.jspider.hibernate.commons;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jspider.hibernate.beans.Course;
import com.jspider.hibernate.beans.InterviewDetails;
import com.jspider.hibernate.beans.Student;
import com.jspider.hibernate.beans.Users;


public class HibernateManyToMany {

	public static void main(String[] args)
	{
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		/*
		 * Many-to-Many:save
	    */
		/*Student student=null;Users users=null;Course course=null;InterviewDetails interviewDetail=null;
		Set<InterviewDetails> interviewDetails=new HashSet<InterviewDetails>();
		int regno=9;int courseid=2;
		
		student=new Student();student.setRegno(regno);student.setFname("ankesh");student.setMname("kumar");student.setLname("singh");
				
		users=new Users();users.setRegno(regno);
		student.setUsers(users);
		
		course=new Course();course.setCourseId(courseid);course.setCourseName("jdbc");
		student.setCourse(course);
		
		interviewDetail=new InterviewDetails();interviewDetail.setInterviewId(13);interviewDetail.setCompanyName("tcs");
		interviewDetail.setTechnology("java");interviewDetail.setLocation("Bangalore");
		interviewDetails.add(interviewDetail);
	
		interviewDetail=new InterviewDetails();interviewDetail.setInterviewId(14);interviewDetail.setCompanyName("cts");
		interviewDetail.setTechnology("C++");interviewDetail.setLocation("Bangalore");
		interviewDetails.add(interviewDetail);
		
		student.setInterviewDetails(interviewDetails);
		
		session.save(student);
		session.flush();
		session.close();
	*/
		/*
		 * Many-to-Many:update
	    */
		/*Student student=null;Users users=null;Course course=null;InterviewDetails interviewDetail=null;
		Set<InterviewDetails> interviewDetails=new HashSet<InterviewDetails>();
		int regno=9;int courseid=2;
		
		student=new Student();student.setRegno(regno);student.setFname("ankeshh");student.setMname("kumarr");
		student.setLname("singhh");
				
		users=new Users();users.setRegno(regno);users.setPassword("vikash123");
		student.setUsers(users);
		
		course=new Course();course.setCourseId(courseid);course.setCourseName("jdbc");
		student.setCourse(course);
		
		interviewDetail=new InterviewDetails();interviewDetail.setInterviewId(13);interviewDetail.setCompanyName("tcss");
		interviewDetail.setTechnology("javaa");interviewDetail.setLocation("Bangaloree");
		interviewDetails.add(interviewDetail);
	
		interviewDetail=new InterviewDetails();interviewDetail.setInterviewId(14);interviewDetail.setCompanyName("ctss");
		interviewDetail.setTechnology("C+++");interviewDetail.setLocation("Bangaloreee");
		interviewDetails.add(interviewDetail);
		
		student.setInterviewDetails(interviewDetails);
		
		session.update(student);
		session.flush();
		session.close();
*/	
		/*
		 * Many-to-Many:select
	    */
		Student student=null;Users users=null;Course course=null;InterviewDetails interviewDetail=null;
		//Set<InterviewDetails> interviewDetails=new HashSet<InterviewDetails>();
		int regno=8;int courseid=2;
		
		student=(Student)session.get(Student.class, regno);
		System.out.println("Regno:"+student.getRegno());
		System.out.println("Fname:"+student.getFname());
		System.out.println("Mname:"+student.getMname());
		System.out.println("Lname:"+student.getLname());
				
		users=student.getUsers();
		System.out.println("Regno:"+users.getRegno());
		System.out.println("Password:"+users.getPassword());
		System.out.println("IsAdmin?:"+users.getIsadmin());
		
		course=student.getCourse();
		System.out.println("CourseID:"+course.getCourseId());
		System.out.println("CourseName:"+course.getCourseName());
		
		Set<InterviewDetails> interviewDetails=student.getInterviewDetails();
		Iterator<InterviewDetails> iterator=interviewDetails.iterator();
		while(iterator.hasNext())
		{
			interviewDetail=iterator.next();
			System.out.println("InterviewID:"+interviewDetail.getInterviewId());
			System.out.println("CompanyName:"+interviewDetail.getCompanyName());
			System.out.println("Technology:"+interviewDetail.getTechnology());
			System.out.println("Location:"+interviewDetail.getLocation());
		}
		
		/*
		 * Many-to-Many:delete
	    */
		/*Student student=null;Users users=null;Course course=null;InterviewDetails interviewDetail=null;
		Set<InterviewDetails> interviewDetails=new HashSet<InterviewDetails>();
		int regno=5;int courseid=2;
		
		student=new Student();
		student.setRegno(regno);
		
		users=new Users();
		users.setRegno(regno);
		student.setUsers(users);
		
		course=new Course();
		course.setCourseId(courseid);
		student.setCourse(course);
		
		interviewDetail=new InterviewDetails();
		interviewDetail.setInterviewId(5);
		interviewDetails.add(interviewDetail);
	
		interviewDetail=new InterviewDetails();
		interviewDetail.setInterviewId(6);
		interviewDetails.add(interviewDetail);
		
		student.setInterviewDetails(interviewDetails);
		
		session.delete(student);
		session.flush();
		session.close();
	*/			
		
	}

}
