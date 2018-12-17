package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //@Controller这个不行
public class TestController {
	
	@RequestMapping("/test")
	public String test(String username, String password) {
		return "springboot测试成功";
	}
}
