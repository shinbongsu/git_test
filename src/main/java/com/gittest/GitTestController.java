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
	
	@RequestMapping("/feature")
	public String feature(){
		return "feature2";
	}
	
	@RequestMapping("/feature3")
	public String feature3(){
		return "feature3";
	}
}
