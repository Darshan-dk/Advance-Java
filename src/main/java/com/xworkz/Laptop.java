package com.xworkz;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="laptop")
public class Laptop implements Serializable{
                	
	@Id
	@GenericGenerator(name= "ref", strategy="increment")
	@GeneratedValue(generator = "ref")
	@Column (name= "lap_id")
	private int lapId;
	@Column (name= "lapPrice")
	private int price;
	@Column (name= "lapName")
	private String name;
	@Column (name= "lapRam")
	private int ram;
	public int getId() {
		return lapId;
	}
	public void setId(int id) {
		this.lapId = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	@Override
	public String toString() {
		return "Laptop [id=" + lapId + ", price=" + price + ", name=" + name + ", ram=" + ram + "]";
	}
	
	
}