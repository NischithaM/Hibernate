package com.cruds.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.cruds.entity.Department;
import com.cruds.util.HibernateUtil;

public class TestDeptUpdate {

	public static void main(String[] args) {
		
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		
		Department d=(Department) session.load(Department.class, new Integer(1));
		d.setDeptname("production");
		session.update(d);
		tx.commit();
		session.close();
		HibernateUtil.shutdown();
	}

}
