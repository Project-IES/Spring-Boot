package com.ashokit.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/todays")
public class DemoController {
		
	@GetMapping("/interview")
	public String greetings() {
		String msg="Hello World";
		return msg;
	}
}
