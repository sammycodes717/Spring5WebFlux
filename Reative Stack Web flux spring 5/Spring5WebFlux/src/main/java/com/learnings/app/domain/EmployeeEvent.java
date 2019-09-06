package com.learnings.app.domain;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class EmployeeEvent {

	private Employee employee;

	private Date date;

}
