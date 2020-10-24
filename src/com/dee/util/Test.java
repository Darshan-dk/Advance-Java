package com.dee.util;

import java.util.Scanner;

import com.dee.dao.InetenetProvider;
import com.dee.dao.InternetProviderImpl;
import com.dee.dto.InternetProviderDTO;

public class Test {
	
	public static void main(String[] args) {
		InternetProviderDTO dto = new InternetProviderDTO();
		System.out.println("enter the internet speed");
		Scanner sc = new Scanner(System.in);
		int speed = sc.nextInt();
//		dto.setId(1);  note : auto increment provided in the DTO class.
		dto.setName("jio");
		dto.setPlan("3 months");
		dto.setPrice(600);
		if(speed>10)
					dto.setStrength("good");
		else
					dto.setStrength("low");
		
		InetenetProvider net =new InternetProviderImpl();
		//crud operations
		net.saveDetails(dto);  //insert / create
		net.fetchDetails(2);  //read
		net.updateList("Airtel", 1);//update
		net.deleteList(InternetProviderDTO.class, 2);//delete
		
	}

}
