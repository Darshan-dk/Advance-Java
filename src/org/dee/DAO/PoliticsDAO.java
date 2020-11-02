package org.dee.DAO;

import org.dee.DTO.PoliticsDTO;

public interface PoliticsDAO {
	
	public  void saveDetails(PoliticsDTO dto);

	public PoliticsDTO fetchData(int id);
	

}
