package org.hibernate.Util;

import org.hibernate.DAO.DepartmentsDAOImpl;
import org.hibernate.DAO.Departments_dao;
import org.hibernate.dto.DepartmentsDTO;

public class Test {
	
	public static void main(String[] args) {
		
		DepartmentsDTO dt = new DepartmentsDTO();
		dt.setDepartmentID(1);
		dt.setDepartmentName("mechanical");
		dt.setNoOfLect(12);
		dt.setNoOfStd(200);
		
		Departments_dao da = new DepartmentsDAOImpl();
		da.saveDepartments(dt);
	}

	


}
