package com.cruds.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.cruds.entity.Courses;
import com.cruds.entity.Student;
import com.cruds.util.HibernateUtil;

public class TestStudentManyToMany {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
/*
		Set<Courses> courses = new HashSet<Courses>();
		courses.add(new Courses("Maths"));
		courses.add(new Courses("Computer Science"));

		Student s1 = new Student("ramya", courses);
		Student s2 = new Student("Sowmya", courses);

		session.save(s1);
		session.save(s2);*/

		tx.commit();
		session.close();

		HibernateUtil.shutdown();


	}

}
