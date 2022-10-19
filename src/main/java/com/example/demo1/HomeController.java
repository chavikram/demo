package com.example.demo1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@GetMapping("/hello")
	public String view() {
		System.out.println("hello");
		return "Hello ";
	}
	@GetMapping("/hello1")
	public String view1() {
		return "Hello1 ";
	}
}
