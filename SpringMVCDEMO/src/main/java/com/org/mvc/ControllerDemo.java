package com.org.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.InternalResourceView;
@Controller
public class ControllerDemo {
	
   @RequestMapping(value = "/", method = RequestMethod.GET)
	//@RequestMapping("/home")
	public String helloMethod() {
		return "home";
	}
   
}
