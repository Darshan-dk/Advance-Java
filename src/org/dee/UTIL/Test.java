package org.dee.UTIL;

import org.dee.DAO.DthDto;
import org.dee.DTO.DthOppDto;

public class Test {
	public static void main(String[] args) {
		
		DthOppDto dth = new DthOppDto();
		dth.setName("sun");
		dth.setPrice(250);
		
		DthDto dao = new DthDto();
//		dao.saveDetails(dth);
		dao.loadDetails(1);
	}
	
	

}
