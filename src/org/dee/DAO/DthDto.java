package org.dee.DAO;

import org.dee.DTO.DthOppDto;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class DthDto {
	private StandardServiceRegistry standardServiceRegistry;
	Session Session=null;
	public void saveDetails(DthOppDto dth) {
		
		
		try {
			standardServiceRegistry= new StandardServiceRegistryBuilder().configure().build();
			MetadataSources metadataSources = new MetadataSources(standardServiceRegistry);
			Metadata metadata = metadataSources.getMetadataBuilder().build();
			SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
			Session = sessionFactory.openSession();
			Transaction beginTransaction = Session.beginTransaction();
			Session.save(dth);
			beginTransaction.commit();
			Session.close();
			sessionFactory.close();
		}catch(HibernateException e) {
			Session.getTransaction().rollback();

			
		}
			
		}
	
	public DthOppDto loadDetails(int id) {
		standardServiceRegistry  = new StandardServiceRegistryBuilder().configure().build();
		MetadataSources metadataSources = new MetadataSources(standardServiceRegistry);
		Metadata metadata = metadataSources.getMetadataBuilder().build();
		SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
	    Session = sessionFactory.openSession();
		
		DthOppDto dto = Session.load(DthOppDto.class, 1);
		System.out.println(dto);
		return dto;
		
	}

	}


