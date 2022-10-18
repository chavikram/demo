package com.example.demo1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@GetMapping("/hello")
	public String view() {
		return "Hello ";
	}
	@GetMapping("/hello1")
	public String view1() {
		return "Hello1 ";
	}
}
