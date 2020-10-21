package com.hibernet.darhan.test;

import com.hibernet.darhan.dao.IplPointsDAO;
import com.hibernet.darhan.dto.IplPointsDTO;

public class IplTest {
public static void main(String[] args) {
		
		
		IplPointsDTO dto  = new IplPointsDTO();
		dto.setIplId(2);
		dto.setIplTeamNames("Kings X11 punjab");
		dto.setCity("punjab");
		dto.setPoints(6);
		dto.setNoOfMatches(9);
		
		
		IplPointsDAO dao   =   new IplPointsDAO();
		dao.saveIplPoints(dto);
		
		
		
	}
	}


