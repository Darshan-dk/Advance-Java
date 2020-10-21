package org.hibernate.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="departments_table")
public class DepartmentsDTO {
	
	public  DepartmentsDTO() {
		System.out.println(this.getClass().getSimpleName()+ " created ");
	}
	
	@Id
	@Column(name="departments_id")
	private int departmentID;
	@Column(name="Departments_name")
	private String departmentName;
	@Column(name="no_of_students")
	private int noOfStd;
	@Column(name="no_of_lectures")
	private int noOfLect;
	
	public int getDepartmentID() {
		return departmentID;
	}
	public void setDepartmentID(int departmentID) {
		this.departmentID = departmentID;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public int getNoOfStd() {
		return noOfStd;
	}
	public void setNoOfStd(int noOfStd) {
		this.noOfStd = noOfStd;
	}
	public int getNoOfLect() {
		return noOfLect;
	}
	public void setNoOfLect(int noOfLect) {
		this.noOfLect = noOfLect;
	}
	
	
	
	

}
