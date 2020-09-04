package com.techleads.app.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.techleads.app.model.APIError;

@RestControllerAdvice
public class EmpControllerAdvice {

	@ExceptionHandler(EmployeeNotFoundException.class)
	public ResponseEntity<APIError> HandleEmployeeNotFoundException(EmployeeNotFoundException exp) {

		APIError error = new APIError("101", "Not Found", "EMP_400", exp.getLocalizedMessage(), "EMPType");
		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	}

}
