package com.learnings.app.domain;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Document
public class Employee {
	
	
	private String id;
	private String name;
	private Long salary;

}
