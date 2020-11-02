package com.dee.singleton;

import org.hibernate.SessionFactory;

public class Test {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateSingelton.getSessionFactory(); 
		System.out.println(sessionFactory);
		SessionFactory sessionFactory1 = HibernateSingelton.getSessionFactory(); 
		System.out.println(sessionFactory1);
		
	}

}
