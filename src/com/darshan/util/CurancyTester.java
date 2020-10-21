package com.darshan.util;

import com.darshan.currancyDAO.CurrancyDAO;
import com.darshan.currancyDAO.CurrencyDAOImpl;
import com.darshan.currancyDTO.CurrencyDTO;

public class CurancyTester {
	
	public static void main(String[] args) {
		CurrencyDTO dto = new CurrencyDTO();
		dto.setCurrencyId(1);
		dto.setCurrencyName("Rupees");
		dto.setCountry("India");
		dto.setExchangeRateWRTUSDollar(78.50);
		
		CurrancyDAO dao = new CurrencyDAOImpl();
		dao.saveCurrency(dto);
	}

}
