package com.learnings.app;

import java.util.UUID;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.util.stream.Stream;
import com.learnings.app.domain.Employee;
import com.learnings.app.repository.EmployeeRepository;

@SpringBootApplication
public class DemoApplication {

	@Bean
	CommandLineRunner employees(EmployeeRepository employeeRepository) {
		return args -> {
			employeeRepository.deleteAll().subscribe(null, null, () -> {
				Stream.of(new Employee(UUID.randomUUID().toString(), "sumit", 27000L),
					new Employee(UUID.randomUUID().toString(), "shivaji", 23000L),
					new Employee(UUID.randomUUID().toString(), "sagar", 24000L),
					new Employee(UUID.randomUUID().toString(), "pavan", 26000L),
					new Employee(UUID.randomUUID().toString(), "suresh", 29000L)
					).forEach(employee -> {
						employeeRepository.save(employee).subscribe(System.out::println);
				});
			});
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

	}

}
