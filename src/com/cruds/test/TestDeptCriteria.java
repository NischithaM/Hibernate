package com.cruds.test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.cruds.entity.Department;
import com.cruds.util.HibernateUtil;

public class TestDeptCriteria {

	public static void main(String[] args) {
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session s=sf.openSession();
		
		
		Criteria c=s.createCriteria(Department.class);
		c.add(Restrictions.eq("deptname", "cs"));
		
		List<Department> dlist=c.list();
		
		for(Department d:dlist)
		{
			System.out.println(d);
		}
		
		s.close();
		HibernateUtil.shutdown();

	}

}
