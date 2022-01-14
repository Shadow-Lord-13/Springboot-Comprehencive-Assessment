package com.springdatajpa.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "EMPLOYEE_TBL")
public class Employee {

	@Id
	@GeneratedValue
	private int id;
	
	private String name;
	private int salary;
	private String designation;
	
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, int salary, String designation) {
		super();
		this.name = name;
		this.salary = salary;
		this.designation = designation;
	}
	
	
}
