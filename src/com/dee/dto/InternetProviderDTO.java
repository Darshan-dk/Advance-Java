package com.dee.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.GenericGenerators;

@Entity
@Table(name="InternetProviderList")
public class InternetProviderDTO {
	
	
	@Id
	@GenericGenerator(name = "ref", strategy = "increment")//auto input for the id
	@GeneratedValue(generator = "ref")
	@Column(name="provider_ID")
	private int id;
	@Column(name="provider_name")
	private String name;
	@Column(name="network_strenth")
	private String strength;
	@Column(name="plan")
	private String plan;
	@Column(name="price")
	private int price;
	
	public InternetProviderDTO() {
	System.out.println(this.getClass().getSimpleName()+ " created");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStrength() {
		return strength;
	}

	public void setStrength(String strength) {
		this.strength = strength;
	}

	public String getPlan() {
		return plan;
	}

	public void setPlan(String plan) {
		this.plan = plan;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "InternetProviderDTO [id=" + id + ", name=" + name + ", strength=" + strength + ", plan=" + plan
				+ ", price=" + price + "]";
	}
	
	
	

}
