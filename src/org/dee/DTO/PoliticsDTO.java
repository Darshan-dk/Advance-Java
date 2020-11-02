package org.dee.DTO;

import java.io.Serializable;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name="politics_party")
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
public class PoliticsDTO  {
	
//	@Id
//	@GeneratedValue(strategy = GenerationType.TABLE)
	@Id
	@GenericGenerator(name = "ref", strategy = "increment")
	@GeneratedValue(generator = "ref")
	@Column(name="party_id")
	private int id;
	@Column(name="party_name")
	private String partyName;
	@Column(name="party_type")
	private String partyType;
	@Column(name="party_symbol")
	private String symbol;
	
	public PoliticsDTO() {
		System.out.println(getClass().getSimpleName()+" created");
		}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPartyName() {
		return partyName;
	}

	public void setPartyName(String partyName) {
		this.partyName = partyName;
	}

	public String getPartyType() {
		return partyType;
	}

	public void setPartyType(String partyType) {
		this.partyType = partyType;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	@Override
	public String toString() {
		return "PoliticsDTO [id=" + id + ", partyName=" + partyName + ", partyType=" + partyType + ", symbol=" + symbol
				+ "]";
	}
	
	
	
	

}
