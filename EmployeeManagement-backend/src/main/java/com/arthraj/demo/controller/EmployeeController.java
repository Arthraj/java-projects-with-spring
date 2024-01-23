package com.arthraj.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.arthraj.demo.entity.Employee;
import com.arthraj.demo.service.EmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
	
	private EmployeeService employeeService;
	
	public EmployeeController(EmployeeService employeeservice) {
		super();
		this.employeeService = employeeservice;
	}

//	save an Employee to database
	@PostMapping
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee emp) {
		return  new ResponseEntity<Employee>(employeeService.saveEmployee(emp),HttpStatus.CREATED);
	}
	
//	get all employee REST API
	@GetMapping
	public List<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();
	}
	
//	Get employee by id
	@GetMapping("{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") Long id){
		return new ResponseEntity<Employee>(employeeService.getEmployee(id),HttpStatus.OK);
	}
	
//	update an Employee
	@PutMapping("{id}")
	public ResponseEntity<Employee> updateEmployee(@RequestBody Employee emp,@PathVariable Long id){
		return new ResponseEntity<Employee>(employeeService.updateEmployee(emp, id),HttpStatus.OK);
	}
	
//	delete employee REST API
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable("id") Long id){
		employeeService.deleteEmployee(id);
		return new ResponseEntity<String>("DELETED",HttpStatus.OK);
	}
}


