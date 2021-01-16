package com.cruds.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import com.cruds.entity.Phone;
import com.cruds.entity.Student;
import com.cruds.util.HibernateUtil;

public class TestStudentOneToMany {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		/*Set<Phone> phones = new HashSet<Phone>();
		Phone p1 = new Phone("Mobile", "9448124163");
		Phone p2 = new Phone("Home", "9448124888");
		Phone p3=new Phone("alternate no", "8073394112");
		phones.add(p1);
		phones.add(p2);
		phones.add(p3);

		Student s1 = new Student("Ramya", phones);
		session.save(s1);*/
		Student s=(Student) session.load(Student.class, new Long(10));
		Set<Phone> phones=d.get
		
		tx.commit();
		session.close(); 
		HibernateUtil.shutdown(); 
		}


}
