package com.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {

	@RequestMapping(value="introtest",method={RequestMethod.POST,RequestMethod.GET})
	public String showHomePage(){
		
	 System.out.println("Invocked");
		
		return "Success";
	}
	
}
