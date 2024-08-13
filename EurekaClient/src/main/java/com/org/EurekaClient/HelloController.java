package com.org.EurekaClient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
		@GetMapping("/get")
		public HelloServer retriveLimit() {
			return new HelloServer(5000, 1000);
	}

	
}
