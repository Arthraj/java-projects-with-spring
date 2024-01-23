package com.arthraj.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


//Creates all the getters, setters , toSting , equals, hashcode
	@Data
// @Entity specifies that the class is an Entity.
	@Entity
// @Table specifies the table in the database to which this entity is Mapped.
	@Table(name="employeeData")
public class Employee {
	
		@Id
		@GeneratedValue(strategy= GenerationType.IDENTITY)
			private long id;
		
		@Column(name="first_name")
			private String firstName;
		
		@Column(name="last_name")
			private String lastName;
		
		@Column(name="email")
			private String email;
		
		
			
}
