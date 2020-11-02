package com.dee.singleton;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateSingelton {
private static SessionFactory  factory = null;
	
	public static SessionFactory getSessionFactory() {
		return factory;
	}
	
	static {
		factory = new Configuration().configure().buildSessionFactory();
	}

}
