package org.hibernate.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.dto.DepartmentsDTO;

public class DepartmentsDAOImpl implements Departments_dao{

	@Override
	public void saveDepartments(DepartmentsDTO dto) {
		Configuration configuration = new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(DepartmentsDTO.class);
		SessionFactory buildSessionFactory = configuration.buildSessionFactory();
		Session openSession = buildSessionFactory.openSession();
		Transaction beginTransaction = openSession.beginTransaction();
		openSession.save(dto);
		beginTransaction.commit();
		openSession.close();
		buildSessionFactory.close();
	}

}
