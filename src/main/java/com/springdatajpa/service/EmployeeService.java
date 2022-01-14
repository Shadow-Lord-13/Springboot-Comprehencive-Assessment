package com.springdatajpa.service;

import java.util.List;
import java.util.Optional;

import com.springdatajpa.entity.Employee;

public interface EmployeeService {

	public Employee saveEmployee(Employee employee);
	public List<Employee> getEmployees();
	public Employee getEmployeeById(int id);
	public Employee updateEmployee(Integer salary, Integer id);
	public Optional<Employee> checkEmployee(int id);

}
