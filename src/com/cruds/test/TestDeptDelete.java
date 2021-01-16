package com.cruds.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.cruds.entity.Department;
import com.cruds.util.HibernateUtil;

public class TestDeptDelete {

	public static void main(String[] args) {
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		
		Department d=(Department) s.load(Department.class,new Integer(3));
		s.delete(d);
		tx.commit();
		s.close();
		HibernateUtil.shutdown();
		
	}

}
