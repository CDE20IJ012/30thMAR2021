package com.cts.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	
	     @GetMapping("/")
	     public String helloWorld()
	     {
	    	 return "Hello to RESTful Web Services";
	     }
	
	
}


