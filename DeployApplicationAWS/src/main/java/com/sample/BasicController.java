package com.sample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {
	
	@RequestMapping("/")
	@ResponseBody
	public String method1() {
		return "This project is deployed in both AWS EC2 and S3 Bucket!"; 
	}

}