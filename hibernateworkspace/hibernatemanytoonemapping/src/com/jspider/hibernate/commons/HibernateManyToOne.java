package com.jspider.hibernate.commons;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jspider.hibernate.beans.Course;
import com.jspider.hibernate.beans.Student;


public class HibernateManyToOne {

	public static void main(String[] args)
	{
		Configuration config=new Configuration();
		config.configure();
		SessionFactory factory=config.buildSessionFactory();
		Session session=factory.openSession();
		
		int regno=4;
		int courseid=5;
		Student student=new Student();
		student.setRegno(regno);
		student.setFname("monu");
		student.setMname("kumar");
		student.setLname("singh");
		
		Course course=new Course();
		course.setCourseId(courseid);
		course.setCourseName("java");	
		student.setCourse(course);
		session.save(student);
		
		session.flush();
		session.close();
		
		/*
		  * Many-to-One:save
		*/
		/*Student student=null;
		Users users=null;
		Course course=null;
		int regno=9;
		int courseid=2;
		student=new Student();
		student.setRegno(regno);
		student.setFname("sudhir");
		student.setMname("kumar");
		student.setLname("singh");
		
		
		users=new Users();
		users.setRegno(regno);
		student.setUsers(users);
		
		course=new Course();
		course.setCourseId(courseid);
		course.setCourseName("jdbc");
		//session.save(course);
		
		student.setCourse(course);
		session.save(student);
		
		session.flush();
		session.close();
	*/
		
 /*		
 *  * Many-to-One:update
*/		
		/*Student student=null;
		Users users=null;
		Course course=null;
		int regno=8;
		int courseid=2;
		student=new Student();
		student.setRegno(regno);
		student.setFname("sudhirr");
		student.setMname("kumarr");
		student.setLname("singhr");
		
		
		users=new Users();
		users.setRegno(regno);
		student.setUsers(users);
		following line will not have any effect because 
		 * many-to-one won't do any changes in master table(i.e course table in this case
		
		course=new Course();
		course.setCourseId(courseid);
		course.setCourseName("0000000");
		//session.save(course);
		
		student.setCourse(course);
		session.update(student);
		
		session.flush();
		session.close();
	*/
		
		/*
		 * Many-to-One:select
		 */
		
		/*Student student=null;
		Users users=null;
		Course course=null;
		int regno=8;
		
		student=(Student)session.get(Student.class,regno);
	    System.out.println("regno:"+student.getRegno());
	    System.out.println("Fname:"+student.getFname());
	    System.out.println("Mname:"+student.getMname());
	    System.out.println("Lname:"+student.getLname());
	    
	    users=student.getUsers();
	    System.out.println("regno:"+users.getRegno());
	    System.out.println("password:"+users.getPassword());
	    System.out.println("Isadmin:"+users.getIsadmin());
	    
	    course=student.getCourse();
	    System.out.println("CourseID:"+course.getCourseId());
	    System.out.println("CourseName:"+course.getCourseName());
		*/
		/*
		 * Many-to-One:delete
		*/
		/*Student student=null;
		Users users=null;
		Course course=null;
		int regno=4;
		int courseid=2;
		
		student=new Student();
		student.setRegno(regno);
		
		users=new Users();
		users.setRegno(regno);
		student.setUsers(users);
		following line will not have any effect because 
		 * many-to-one won't do any changes in master table(i.e course table in this case
		
		
		course=new Course();
		course.setCourseId(courseid);
		student.setCourse(course);
		
		session.delete(student);
		session.flush();
		session.close();
*/		
		}

}
