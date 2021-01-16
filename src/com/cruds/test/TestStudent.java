package com.cruds.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.cruds.entity.Address;
import com.cruds.entity.Courses;
import com.cruds.entity.Phone;
import com.cruds.entity.Student;
import com.cruds.util.HibernateUtil;

public class TestStudent {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		Address a1 = new Address("SIT 9th Cross", "TUMKUR", "Karnataka", "572102");
		Set<Phone> phones = new HashSet<Phone>();
		Phone p1 = new Phone("Mobile", "9448124163");
		Phone p2 = new Phone("Home", "9448124888");
		phones.add(p1);
		phones.add(p2);
		Set<Courses> courses = new HashSet<Courses>();
		courses.add(new Courses("Maths"));
		courses.add(new Courses("Computer Science"));
		
		Student s1 = new Student("dhanu", a1, phones, courses);
		session.save(s1);
		tx.commit();
		session.close(); 
		HibernateUtil.shutdown(); 


	}

}
