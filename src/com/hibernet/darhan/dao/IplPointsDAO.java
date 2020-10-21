package com.hibernet.darhan.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernet.darhan.dto.IplPointsDTO;


public class IplPointsDAO {
	
	public IplPointsDAO() {

		System.out.println(this.getClass().getSimpleName() + "created");
	}

	public void saveIplPoints(IplPointsDTO dto) {
		Configuration configuration = new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(IplPointsDTO.class);
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(dto);
		transaction.commit();
		session.close();
		factory.close();
	}

}
