package com.techleads.app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class APIError {
	
	private String id;
	private String message;
	private String code;
	private String error;
	private String classType;

}
