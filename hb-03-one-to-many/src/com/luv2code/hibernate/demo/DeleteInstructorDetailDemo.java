package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
import com.luv2code.hibernate.demo.entity.Student;

public class DeleteInstructorDetailDemo {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Instructor.class)
								.addAnnotatedClass(InstructorDetail.class)
								.buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {
			
			
			session.beginTransaction();
			
			int theId = 4;
			InstructorDetail tempInstructorDetail = 
								session.get(InstructorDetail.class, theId);
			
			System.out.println("tempInstructorDetail: " + tempInstructorDetail);
			
			System.out.println("the associated instructor: " + 
								tempInstructorDetail.getInstructor());
			
			System.out.println("deleting tempInstructorDetail: " 
								+ tempInstructorDetail);
			
			tempInstructorDetail.getInstructor().setInstructorDetail(null);
			
			
			session.delete(tempInstructorDetail);
			
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}
		catch (Exception exc) {
			exc.printStackTrace();
			
		}
		finally {
			
			session.close();
			factory.close();
		}
	}

}





