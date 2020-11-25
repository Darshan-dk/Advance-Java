package com.xworkz;

import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.query.Query;

import com.dee.ServiceRisterySingelton;
import com.dee.singleton.HibernateSingelton;



public class CountryDao {
	Session session = null;
	Transaction beginTransaction = null;

	public void SaveDetails(CountryDto dto) {

		try {
			session = HibernateSingelton.getSessionFactory().openSession();
			beginTransaction = session.beginTransaction();
			session.save(dto);
			session.getTransaction().commit();

		} catch (HibernateException e) {
			session.getTransaction().rollback();
		} finally {
			if (session != null)
				session.close();
		}

	}

	public void UpdatePopByCountryName(long populations, String countryName) {

		try {
			session = HibernateSingelton.getSessionFactory().openSession();
			Query namedQuery = session.getNamedQuery("updatePopByCountryName");
			namedQuery.setParameter("pop", populations);
			namedQuery.setParameter("nm", countryName);
			session.beginTransaction();
			namedQuery.executeUpdate();
			session.getTransaction().commit();
		} catch (HibernateException e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			if (session != null)
				session.close();
		}
	}

	public void deletCountryByName(String countryName) {
		try {
			Session session = HibernateSingelton.getSessionFactory().openSession();
			Query query = session.getNamedQuery("deleteByCountryName");
			session.beginTransaction();
			query.setParameter("cn", countryName);
			query.executeUpdate();
			session.getTransaction().commit();

		} catch (HibernateException e) {
			session.getTransaction().rollback();

			e.printStackTrace();
		} finally {
			if (session != null)
				session.close();
		}

	}

	public CountryDto selectByCourrancyName(String name) {
		CountryDto sqlData = null;
		try {
			Session session = HibernateSingelton.getSessionFactory().openSession();
			Query query = session.getNamedQuery("selectByCurrencyName");
			query.setParameter("cn", name);
			sqlData = (CountryDto) query.uniqueResult();
			System.out.println(sqlData);

		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return sqlData;

	}
	public List<CountryDto> retriveAllData() {
		List<CountryDto> sqlData = null;
		try {
			Session session = HibernateSingelton.getSessionFactory().openSession();
			Query query = session.getNamedQuery("listOfCountry");
			sqlData=query.list();
			for (CountryDto countryDto : sqlData) {
				System.out.println(countryDto);
			}
			
			
		}catch(HibernateException e) {
			e.printStackTrace();
		}finally {
			if(session!=null) {
				session.clear();
			}
		}
		return sqlData;
		
	}

}
