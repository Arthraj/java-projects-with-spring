package com.arthraj.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.arthraj.demo.entity.Employee;
import com.arthraj.demo.exception.ResourceNotFoundException;
import com.arthraj.demo.repository.EmployeeRepository;
import com.arthraj.demo.service.EmployeeService;

//EmployeeServiceImpl is a class which implements EmployeeService Interface which is in the parent folder.

@Service
public class EmployeeServiceImpl implements EmployeeService{

	public EmployeeRepository employeeRepository;
	
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}


	@Override
	public Employee saveEmployee(Employee emp) {
		return employeeRepository.save(emp);
	}


	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}


	@Override
	public Employee getEmployee(Long id) {
		Optional<Employee> emp=employeeRepository.findById(id);
		if(emp.isPresent())
			return emp.get();
		else throw new ResourceNotFoundException("Employee","Id",id);
	}


	@Override
	public Employee updateEmployee(Employee emp,Long id) {
		Employee existing=employeeRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Employee","Id",id));
		existing.setFirstName(emp.getFirstName());
		existing.setLastName(emp.getLastName());
		existing.setEmail(emp.getEmail());
		employeeRepository.save(existing);
		return existing;
	}


	@Override
	public void deleteEmployee(Long id) {
		employeeRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Employee","Id",id));
		employeeRepository.deleteById(id);
	}

}
