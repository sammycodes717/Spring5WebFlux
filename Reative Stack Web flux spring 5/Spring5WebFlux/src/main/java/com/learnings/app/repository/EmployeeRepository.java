package com.learnings.app.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.learnings.app.domain.Employee;

public interface EmployeeRepository extends ReactiveMongoRepository<Employee, String> {

}
