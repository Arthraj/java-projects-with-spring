package com.arthraj.demo.service;

import java.util.List;
import java.util.Optional;

import com.arthraj.demo.entity.Employee;

public interface EmployeeService {

	Employee saveEmployee(Employee emp);
	List<Employee> getAllEmployees();
	Employee getEmployee(Long id);
	Employee updateEmployee(Employee emp,Long id);
	void deleteEmployee(Long id);
}
