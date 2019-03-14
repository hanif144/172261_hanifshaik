package com.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.servlet.mvc.AbstractController;
//
//public class JavaController extends AbstractController{
//
//	@Override
//	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) 
//			throws Exception {		
//		
//		ModelAndView mv=new ModelAndView("HelloPage");
//		mv.addObject("welcomeMessage", "Hi user");
//		
//		return mv;
//	}
//
//}
@Controller
@RequestMapping("/greet")
public class HelloController{
	@RequestMapping("/welcome/{country}/{username}")
//	public ModelAndView helloWorld(@PathVariable("username") String name,@PathVariable("country") String c)
	public ModelAndView helloWorld(@PathVariable Map<String,String> pathVars)
	{
		String name=pathVars.get("username");
		String c=pathVars.get("country");
		ModelAndView mv=new ModelAndView("HelloPage");
	mv.addObject("msg", "Hi  "+name+" you are from :-"+c);
	return mv;
	}
//	@RequestMapping("/hi")
//	public ModelAndView hihelloWorld()
//	{
//		ModelAndView mv=new ModelAndView("HelloPage");
//	mv.addObject("msg", "Hi  haneef shaik");
//	return mv;
//	}
}
