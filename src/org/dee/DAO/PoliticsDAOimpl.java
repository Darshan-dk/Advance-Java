package org.dee.DAO;

import org.dee.DTO.PoliticsDTO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;



public class PoliticsDAOimpl implements PoliticsDAO{
	

	private StandardServiceRegistry standardServiceRegistry;

	@Override
	public void saveDetails(PoliticsDTO dto) {
		

		standardServiceRegistry= new StandardServiceRegistryBuilder().configure().build();
		 MetadataSources metadataSources = new MetadataSources(standardServiceRegistry);
		Metadata metadata = metadataSources.getMetadataBuilder().build();
		SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
		Session Session = sessionFactory.openSession();
		Transaction beginTransaction = Session.beginTransaction();	
		Session.save(dto);
		beginTransaction.commit();
		Session.close();
		sessionFactory.close();
		
	}
	@Override
	public PoliticsDTO fetchData(int id) {
		
		standardServiceRegistry = new StandardServiceRegistryBuilder().configure().build();
		MetadataSources metadataSources = new MetadataSources(standardServiceRegistry);
		Metadata metadata = metadataSources.getMetadataBuilder().build();
		SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
		Session session = sessionFactory.openSession();
		PoliticsDTO politicsDTO = session.get(PoliticsDTO.class, id);
		System.out.println(politicsDTO);
		session.close();
		Session session2 = sessionFactory.openSession();
		PoliticsDTO politicsDTO2 = session2.get(PoliticsDTO.class, id);
		System.out.println(politicsDTO2);
		session2.close();
		return politicsDTO;
		
		
	}

}
