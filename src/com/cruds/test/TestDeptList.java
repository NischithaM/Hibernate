package com.cruds.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.cruds.entity.Department;
import com.cruds.util.HibernateUtil;

public class TestDeptList {
	
	public static void main(String[] args) {
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session session=sf.openSession();
		
		List<Department> dlist=session.createQuery("from Department").list();
		
		for(Department d:dlist)
		{
			System.out.println(d);
		}
		
		session.close();
		HibernateUtil.shutdown();
	}
}
