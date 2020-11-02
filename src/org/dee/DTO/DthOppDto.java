package org.dee.DTO;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="dth")
public class DthOppDto implements Serializable {
	
	@Id
	@GenericGenerator(name = "ref", strategy = "increment")
	@GeneratedValue(generator = "ref")
	@Column(name="ID")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="price")
	private int price;
	public DthOppDto() {
		System.out.println(getClass().getSimpleName()+" created");
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "DthOppDto [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	
	
	

}
