package com.jspider.hibernate.commons;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.jspider.hibernate.beans.Course;
import com.jspider.hibernate.beans.Student;
import com.jspider.hibernate.beans.Users;
public class HibernateQueryLanguage {
	public static void main(String[] args)
	{
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
	
		Student student=null;Users users=null;Course course=null;
		/*String sql1="from Student";
		Query query=session.createQuery(sql1);
		List<Object> results=query.list();
		for(Object resultObj:results)
		{
			student=(Student)resultObj;
			System.out.println("RegNo:"+student.getRegno());
			System.out.println("FirstName:"+student.getFname());
			System.out.println("MiddleName:"+student.getMname());
			System.out.println("LastName:"+student.getLname());
		}
		users=student.getUsers();
		if(users!=null)
		{
			System.out.println("User Object Present");
		}
		else
		{
		System.out.println("User Object is not present");	
		}
		
		course=student.getCourse();
		if(course!=null)
		{
			System.out.println("Course Object Present");
		}
		else
		{
			System.out.println("Course Object Present");
		}
*/
		
		/*String sql2="from Student s,Users u where s.regno=u.regno and s.regno>=:minRegno";
		Query query=session.createQuery(sql2);
		query.setInteger("minRegno",5);
		List<Object[]> results=query.list();
		for(Object[] resultObj:results)
		{
			student=(Student)resultObj[0];
			users=(Users)resultObj[1];			
			System.out.println("RegNo:"+student.getRegno());
			System.out.println("FirstName:"+student.getFname());
			System.out.println("MiddleName:"+student.getMname());
			System.out.println("LastName:"+student.getLname());
			System.out.println("IsAdmin?"+users.getIsadmin());
	   }
*/	
		
		/*String sql3="select fname from Student where regno>=:minRegno";
		Query query=session.createQuery(sql3);
		query.setInteger("minRegno",1);
		List<Object> results=query.list();
		for(Object resultObj:results)
		{
			String fname=(String)resultObj;
			System.out.println("FirstName:"+fname);
			}*/
		String sql4="select s.fname,u.isadmin from Student s,Users u where s.regno=u.regno and s.regno>=:minRegno";
		Query query=session.createQuery(sql4);
		query.setInteger("minRegno",1);
		List<Object[]> results=query.list();
		for(Object[] resultObj:results)
		{
			String fname=(String)resultObj[0];
			String isAdmin=(String)resultObj[1];
			System.out.println("FirstName:"+fname);
			System.out.println("FirstName:"+isAdmin);
			
	    }	
	}
}
