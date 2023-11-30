package com.nextgentechsavvy.springbootdemo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping(value="/spring-boot-demo")
public class SpringBootDemoController {
	
	@GetMapping("test")
	public String HelloWorldTest() {
		return "Sample Spring Boot Hello World EclipseIDE Example. Thanks";
	}

}
