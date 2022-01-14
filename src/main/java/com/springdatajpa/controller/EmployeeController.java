package com.springdatajpa.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.springdatajpa.entity.Employee;
import com.springdatajpa.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService service;


	@PostMapping("/addEmployee") // single employee
	public Employee addProduct(@RequestBody Employee employee)throws Exception  {
		Optional<Employee> employeeEntry = service.checkEmployee(employee.getId()); 
		if(employeeEntry.isPresent()){
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Employee already exist in the database!");
		} 
		return service.saveEmployee(employee);
	}

	@GetMapping("/employees") // get all employees
	public List<Employee> findAllEmployee(){
		return service.getEmployees();
	}
	@GetMapping("/employeeById/{id}") // get employee by id
	public Employee findProductById(@PathVariable int id) {
		return service.getEmployeeById(id);
	}

	@PutMapping("/update/{id}/{salary}") // update employee
	public Employee updateEmployee(@PathVariable("id") Integer id, @PathVariable ("salary") Integer salary) {
		return service.updateEmployee(salary,id);
	}

}
