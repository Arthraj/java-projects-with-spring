package com.arthraj.demo.entity;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
@Data
@Entity

@Document(collection="ems")
public class Candidate {
	
	@Id
	private long cid;
	
	
	private String firstName;
	
	private String lastName;
	
	private Date dob;
	
	private String email;
	
	private String resumeUrl;
}
