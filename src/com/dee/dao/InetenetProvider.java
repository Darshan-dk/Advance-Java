package com.dee.dao;

import com.dee.dto.InternetProviderDTO;

public interface InetenetProvider {
	
	public void saveDetails(InternetProviderDTO dto);
	public void fetchDetails(int provider_ID) ;
	public void updateList(String name, int id);
	public void deleteList(Class<?> type, int id);
}
