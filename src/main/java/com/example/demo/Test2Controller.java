package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class Test2Controller {
	@RequestMapping("/hello")
	public String hello() {
		return "Hello";
	}
}
