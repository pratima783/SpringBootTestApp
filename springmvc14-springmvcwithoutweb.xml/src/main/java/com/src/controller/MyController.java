package com.src.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {

	@RequestMapping("/")
	public String display()
	{
		System.out.println("first");
		return "index";
	}
	
	@RequestMapping(path="/demo",method=RequestMethod.GET )
	public String dis()
	{
		System.out.println("SEc");
		return "welcome";
	}
	
	
}

