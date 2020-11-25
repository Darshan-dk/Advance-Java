package com.xworkz;

public class Test {
	public static void main(String[] args) {
		CountryDto dto  = new CountryDto();
		dto.setCountryName("UAE");
		dto.setContryCurrency("real");
		dto.setNoOfStates(55);
		dto.setPopulations(2125497l);
		
		CountryDao dao = new CountryDao();
//	dao.SaveDetails(dto);
//	dao.UpdatePopByCountryName(12348957557l, "India");
//	dao.deletCountryByName("USA");
//	dao.selectByCourrancyName("real");
	dao.retriveAllData();
	}

}
