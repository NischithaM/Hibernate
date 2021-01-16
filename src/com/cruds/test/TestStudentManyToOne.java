package com.cruds.test;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.cruds.entity.Address;
import com.cruds.entity.Student;
import com.cruds.util.HibernateUtil;

public class TestStudentManyToOne {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		Address a1 = new Address("SIT 9th Cross", "TUMKUR", "Karnataka", "572102");
		Student s1 = new Student("charan", a1);
		Student s2 = new Student("kamal", a1);
		session.save(s1);
		session.save(s2);
		tx.commit();
		session.close();

		HibernateUtil.shutdown();
	}

}
