package com.darshan.currancyDAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.darshan.currancyDTO.CurrencyDTO;

public class CurrencyDAOImpl  implements CurrancyDAO{

	@Override
	public void saveCurrency(CurrencyDTO currencyDTO) {
		// TODO Auto-generated method stub
		Configuration configuration = new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(CurrencyDTO.class);
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(currencyDTO);
		tx.commit();
		session.close();
		factory.close();
		
	}

}
