package com.gittest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitTestController {

	@RequestMapping("/")
	public String index(){
		return "Hello";
	}
	
	@RequestMapping("/hello")
	public String hello(){
		return "Say Hello";
	}
}
