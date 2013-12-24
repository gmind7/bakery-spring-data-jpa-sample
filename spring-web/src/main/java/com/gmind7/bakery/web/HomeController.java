package com.gmind7.bakery.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(){
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<");
		return "index";
	}
	
}
