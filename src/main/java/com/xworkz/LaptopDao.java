package com.xworkz;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.dee.singleton.HibernateSingelton;

public class LaptopDao {
	
	public void saveDetails(Laptop dto) {
		
		 Session session =null;
		 Transaction beginTransaction =null;
		try {
			  session = HibernateSingelton.getSessionFactory().openSession();
			  beginTransaction = session.beginTransaction();
			  session.save(dto);
			  session.getTransaction().commit();
			  
			
		}catch(HibernateException e) {
			session.getTransaction().rollback();
		}finally{
			if(session!=null)
				session.close();
		}
		
	}

}
