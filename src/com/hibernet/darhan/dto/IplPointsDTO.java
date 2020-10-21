package com.hibernet.darhan.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ipl_table")
public class IplPointsDTO implements Serializable {
	
	@Id
	@Column(name="ipl_id")
	private int iplId;
	@Column(name="ipl_team_name")
	private String iplTeamNames;
	@Column(name="city")
	private String city;
	@Column(name="no_of_matches")
	private int noOfMatches;
	@Column(name="points")
	private int points;
	
	public IplPointsDTO() {
		System.out.println(this.getClass().getSimpleName()+"created");
	}

	public int getIplId() {
		return iplId;
	}

	public void setIplId(int iplId) {
		this.iplId = iplId;
	}

	public String getIplTeamNames() {
		return iplTeamNames;
	}

	public void setIplTeamNames(String iplTeamNames) {
		this.iplTeamNames = iplTeamNames;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getNoOfMatches() {
		return noOfMatches;
	}

	public void setNoOfMatches(int noOfMatches) {
		this.noOfMatches = noOfMatches;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}
}
