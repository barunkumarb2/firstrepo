package com.test;

import java.util.logging.Logger;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class TestController {

	private static final Logger	mLogger	= Logger.getLogger(TestController.class.getPackage().getName());
	
	
	public TestController(){
		mLogger.info("Constructor Invoked Test for Staging-issue Branch");
	}
	
	@RequestMapping(value="introtest",method={RequestMethod.POST,RequestMethod.GET})
	public String showHomePage(){
		
		mLogger.info("Invoked ");
	
		
		return "Success";
	}
	
}
