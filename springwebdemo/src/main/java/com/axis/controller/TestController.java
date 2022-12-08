package com.axis.controller;

import java.util.List;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("api/v1")
public class TestController {
	
	ArrayList<String> fruits = new ArrayList<String>();
	public TestController() {
		fruits.add("apple");
		fruits.add("Banana");
		fruits.add("Orange");
	
		
	}
	@GetMapping("/fruits")
	public List<String> getAllFruits()
	{
		return fruits;
	}

}
