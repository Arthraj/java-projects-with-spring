package com.project.CMS.entity;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;

@Data
@Document(collection="ems")
public class Candidate {
	@Id
private long cid;
	@Field
	private String firstName;
	@Field
	private String lastName;
	@Field
	private Date dob;
	@Field
	private String email;
	@Field
	private String resumeUrl;
}
