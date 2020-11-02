package org.dee.Util;

import org.dee.DAO.PoliticsDAO;
import org.dee.DAO.PoliticsDAOimpl;
import org.dee.DTO.PoliticsDTO;
import org.hibernate.cache.ehcache.EhCacheRegionFactory;

public class Test {
	
	public static void main(String[] args) {
		
	//	EhCacheRegionFactory
		
		PoliticsDTO dto = new PoliticsDTO();
		dto.setPartyName("cng");
		dto.setPartyType("National");
		dto.setSymbol("Lotus");
		
		PoliticsDAO dao = new PoliticsDAOimpl();
//		dao.saveDetails(dto);
		dao.fetchData(1);

	}
}
