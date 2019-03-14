package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class HomeController {
	private static final long serialVersionUID = 1L;
	
	@RequestMapping("/welcome")
	   public ModelAndView hello()
	   {
		   ModelAndView m=new ModelAndView("view/Home");
		return m ;
	   }
	
	@RequestMapping("/registration")
	   public ModelAndView hell14()
	   {
		   ModelAndView m=new ModelAndView("view/Registeration");
		return m ;
	   }
	
	
	
	@RequestMapping("/samsung")
	   public ModelAndView hello1()
	   {
		   ModelAndView m=new ModelAndView("view/Samsung");
		return m ;
	   }
	
	@RequestMapping("/samsungj7")
	   public ModelAndView hello2()
	   {
		   ModelAndView m=new ModelAndView("view/Samsung J7");
		return m ;
	   }
	
	@RequestMapping("/redmi4a")
	   public ModelAndView hello3()
	   {
		   ModelAndView m=new ModelAndView("view/REDMI4A");
		return m ;
	   }
	@RequestMapping("/redmi5pro")
	   public ModelAndView hello4()
	   {
		   ModelAndView m=new ModelAndView("view/REDMI 5 PRO");
		return m ;
	   }
	@RequestMapping("/nokia6")
	   public ModelAndView hello5()
	   {
		   ModelAndView m=new ModelAndView("view/NOKIA6");
		return m ;
	   }
	
	@RequestMapping("/iphone")
	   public ModelAndView hello6()
	   {
		   ModelAndView m=new ModelAndView("view/IPHONE");
		return m ;
	   }
	
	@RequestMapping("/login")
	   public ModelAndView hello7()
	   {
		   ModelAndView m=new ModelAndView("view/phones");
		return m ;
	   }
	@RequestMapping("/login1")
	   public ModelAndView hello8()
	   {
		   ModelAndView m=new ModelAndView("view/phones");
		return m ;
	   }
	
	@RequestMapping("/login2")
	   public ModelAndView hello9()
	   {
		   ModelAndView m=new ModelAndView("view/phones");
		return m ;
	   }
	
	@RequestMapping("/login3")
	   public ModelAndView hello10()
	   {
		   ModelAndView m=new ModelAndView("view/phones");
		return m ;
	   }
	@RequestMapping("/login4")
	   public ModelAndView hello11()
	   {
		   ModelAndView m=new ModelAndView("view/phones");
		return m ;
	   }
	@RequestMapping("/login5")
	   public ModelAndView hello12()
	   {
		   ModelAndView m=new ModelAndView("view/phones");
		return m ;
	   }
	
	
	
	
}
