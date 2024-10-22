package com.app2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo2 {

	@GetMapping("/home")
	public String home() {
		return "hello this is home page of demo";
	}
	
}
