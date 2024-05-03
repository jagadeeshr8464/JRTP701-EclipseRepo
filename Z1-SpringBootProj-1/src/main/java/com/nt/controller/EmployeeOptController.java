package com.nt.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeOptController {

	public ResponseEntity<String> hello()
	{
		return new ResponseEntity<String>("Hello world", HttpStatus.OK);
	}
	
}
