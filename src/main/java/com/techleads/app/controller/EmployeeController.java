package com.techleads.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.techleads.app.exceptions.EmployeeNotFoundException;
import com.techleads.app.model.Employee;

@RestController
public class EmployeeController {
	@Autowired
	HttpHeaders HttpHeaders;

	@GetMapping(value = { "/employes/{id}" })
	public ResponseEntity<Employee> findEmpById(@PathVariable("id") Integer id) {

		if (id != 5) {
			throw new EmployeeNotFoundException("Employee not found for the Id: " + id);
		}

		Employee emp = new Employee(5, "MADHAV");
		HttpHeaders.set("EMP", "US_123");

		return new ResponseEntity<>(emp, HttpHeaders, HttpStatus.OK);

	}

}
