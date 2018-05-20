package com.spring.controller;


import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {
	
	@RequestMapping(value="/users")
	public Map<String,String> getUsers() {
		
		System.out.println("hello method");
		
		Map<String,String> map = new HashMap<>();
		map.put("name", "krishna");
		return map;
		
	}
	
}