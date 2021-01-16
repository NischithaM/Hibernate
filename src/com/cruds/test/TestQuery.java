package com.cruds.test;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.cruds.entity.Department;
import com.cruds.util.HibernateUtil;

public class TestQuery {

	public static void main(String[] args) {
		
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session s=sf.openSession();
		
		String hql="from Department";
		String hql2="from Department d where d.deptid=:departmentid";
		Query query=s.createQuery(hql2);
		query.setParameter("departmentid", 2);
		List<Department> dlist=query.list();
		
		for(Department d:dlist)
		{
			System.out.println(d);
		}
		s.close();
		HibernateUtil.shutdown();
	}

}
