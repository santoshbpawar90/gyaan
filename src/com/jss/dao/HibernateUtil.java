package com.jss.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;



public class HibernateUtil {
	public static SessionFactory factory;
	static {
		try {
			factory = new AnnotationConfiguration().configure(
					"hibernate.cfg.xml").buildSessionFactory();
		} catch (Throwable ex) {
			System.err.println("Failed to create sessionFactory object." + ex);
			throw new ExceptionInInitializerError(ex);
		}

	}

	public static Session openSession() {
		return factory.openSession();
	}
}
