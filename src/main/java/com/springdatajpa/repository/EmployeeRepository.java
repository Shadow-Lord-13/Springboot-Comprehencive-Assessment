package com.springdatajpa.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springdatajpa.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	//Employee findBySalary(int salary);
	List<Employee> findByOrderBySalaryDescNameAsc();
	Optional<Employee> findById(int id);

}
