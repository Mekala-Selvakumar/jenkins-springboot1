package com.learn.jenkins_springboot1.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController	
@RequestMapping("/api/v1")
public class FirstController {
	
	@GetMapping("/message")
    public ResponseEntity<String> getMessage() {
		return new ResponseEntity<String>("Welcome ..." ,HttpStatus.OK);
		
	}
}
