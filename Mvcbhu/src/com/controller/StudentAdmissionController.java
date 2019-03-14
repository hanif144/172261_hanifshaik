package com.controller;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentAdmissionController {
	@RequestMapping(value="/admission.html",method=RequestMethod.GET)
	public ModelAndView getAdmissionForm()
	{
		ModelAndView model=new ModelAndView("AdmissionForm");
		model.addObject("header","geethanjali college of engineering");
		return model;
	}
	@RequestMapping(value="/submitAdmissionForm.html",method=RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@ModelAttribute("student1")Student student1)
	{
		
		
		return model;
		
		
	}
}
	
	