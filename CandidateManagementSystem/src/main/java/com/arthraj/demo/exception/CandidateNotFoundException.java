package com.arthraj.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code=HttpStatus.NOT_FOUND)
public class CandidateNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	private String resourceName;
	private String fieldName;
	private Long fieldValue;
	
	public CandidateNotFoundException(String resourceName, String fieldName, Long id) {
		super(String.format("%s not found with %s :: '%s' value", resourceName,fieldName,id));
		this.resourceName = resourceName;
		this.fieldName = fieldName;
		this.fieldValue = id;
	}

	public String getResourceName() {
		return resourceName;
	}

	public String getFieldName() {
		return fieldName;
	}

	public Long getFieldValue() {
		return fieldValue;
	}
	
}
