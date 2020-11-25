package com.xworkz;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@NamedQueries({
@NamedQuery(query="update CountryDto dto set dto.populations=:pop where dto.countryName=:nm" , name="updatePopByCountryName"),
@NamedQuery(query="delete from CountryDto dto where dto.countryName=:cn",name="deleteByCountryName"),
@NamedQuery(query="select dto from CountryDto dto where dto.contryCurrency=:cn",name="selectByCurrencyName"),
@NamedQuery(query="from CountryDto dto" ,name="listOfCountry")   
})
@Table(name="country")
public class CountryDto implements Serializable {
	
	@Id
	@GenericGenerator(name="ref", strategy ="increment")
	@GeneratedValue(generator = "ref")
	@Column(name="country_id")
	private int countryId;
	@Column(name="country_name")
	private String countryName;
	@Column(name="country_currency")
	private String contryCurrency;
	@Column(name="no_of_states")
	private int noOfStates;
	@Column(name="populations")
	private long populations;
	public int getCountryId() {
		return countryId;
	}
	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getContryCurrency() {
		return contryCurrency;
	}
	public void setContryCurrency(String contryCurrency) {
		this.contryCurrency = contryCurrency;
	}
	public int getNoOfStates() {
		return noOfStates;
	}
	public void setNoOfStates(int noOfStates) {
		this.noOfStates = noOfStates;
	}
	public long getPopulations() {
		return populations;
	}
	public void setPopulations(long populations) {
		this.populations = populations;
	}
	@Override
	public String toString() {
		return "CountryDto [countryId=" + countryId + ", countryName=" + countryName + ", contryCurrency="
				+ contryCurrency + ", noOfStates=" + noOfStates + ", populations=" + populations + "]";
	}
	
	
	

}
