package com.project.EMS.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.EMS.entity.Employee;
import com.project.EMS.exception.ResourceNotFoundException;
import com.project.EMS.repository.EmployeeRepository;

@CrossOrigin(origins ="http://localhost:3000/")
@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository empRepo;
	
//	get all employees
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployees(){
		return empRepo.findAll();
	}
	
//	create employee Rest API
	@PostMapping("/employees")
	public Employee createEmployee(@RequestBody Employee emp) {
		return empRepo.save(emp);
	}
	
//	get employee by id
	
	@GetMapping("/employees/{id}")
	public ResponseEntity<Employee> getEmployee(@PathVariable Long id) {
		Employee emp= empRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("Employee Not found with this Id= " + id));
		return ResponseEntity.ok(emp);
	}
	
//	update Employee rest api
	@PutMapping("/employees/{id}")
	public ResponseEntity<Employee> updateEmployee(@RequestBody Employee emp,@PathVariable Long id){
		Employee employee=empRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("Employee Not found with this Id= " + id));
		employee.setFirstName(emp.getFirstName());
		employee.setLastName(emp.getLastName());
		employee.setEmailId(emp.getEmailId());
		Employee updated=empRepo.save(employee);
		return ResponseEntity.ok(updated);
	}
	
	@DeleteMapping("/employees/{id}")
	public ResponseEntity<Map<String,Boolean>> deleteEmployee(@PathVariable Long id){
		Employee emp= empRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("Employee Not found with this Id= " + id));
		empRepo.delete(emp);
		Map<String,Boolean>response=new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
	
}










