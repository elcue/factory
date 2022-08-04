package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@RequestMapping("/")
	public String test() {
		
		return "hello!";
	}
	
	@RequestMapping("/members")
	public String members() {
		
		return "hi tom!";
	}

}
