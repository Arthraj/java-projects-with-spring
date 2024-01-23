package com.project.EMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.EMS.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long>{
	
}
