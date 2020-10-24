package com.dee.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.dee.dto.InternetProviderDTO;

public class InternetProviderImpl implements InetenetProvider{

	@Override
	public void saveDetails(InternetProviderDTO dto) {
		Configuration configuration = new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(InternetProviderDTO.class);
		SessionFactory SessionFactory = configuration.buildSessionFactory();
		Session session = SessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(dto);
		transaction.commit();
		session.close();
		SessionFactory.close();
	
	}
	@Override
	public void fetchDetails(int provider_ID) {
		Configuration configuration = new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(InternetProviderDTO.class);
		SessionFactory SessionFactory = configuration.buildSessionFactory();
		Session session = SessionFactory.openSession();
	
//		session.save(dto);
		InternetProviderDTO dto = session.get(InternetProviderDTO.class, provider_ID);
		System.out.println(dto);
		session.close();
		SessionFactory.close();
	
	}
	@Override
	public void updateList(String name, int id) {
		Configuration configuration = new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(InternetProviderDTO.class);
		SessionFactory SessionFactory = configuration.buildSessionFactory();
		Session session = SessionFactory.openSession();
		session.beginTransaction();
//		session.save(dto);
		InternetProviderDTO dto1 = session.get(InternetProviderDTO.class, id);
		if (dto1!=null) {
			dto1.setName(name);
			dto1.setPrice(500);
			session.update(dto1);
			
		}
	
		session.getTransaction().commit();
		session.close();
		SessionFactory.close();
	
	}
	@Override
	public void deleteList(Class<?> type, int id) {
		Configuration configuration = new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(InternetProviderDTO.class);
		SessionFactory SessionFactory = configuration.buildSessionFactory();
		Session session = SessionFactory.openSession();
		session.beginTransaction();
//		session.save(dto);
		InternetProviderDTO dto = session.get(InternetProviderDTO.class, id);
		if (dto!=null) {
			session.delete(dto);
			
		}
		session.getTransaction().commit();
		session.close();
		SessionFactory.close();
	
	}
	

}


