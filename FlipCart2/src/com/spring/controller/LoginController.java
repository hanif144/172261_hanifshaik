package com.spring.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.han.dao.UserAccountDao;




@Controller
public class LoginController {

	UserAccountDao  v=new UserAccountDao();
	
	@RequestMapping(value = "validate", method = RequestMethod.POST)
	public ModelAndView getLogin(HttpServletRequest request, HttpServletResponse response, @RequestParam("username") String username,@RequestParam("password") String password) throws SQLException, IOException 
	{
		HttpSession session=request.getSession();
		int res=0;
		ModelAndView m=null;
		
		String username1=request.getParameter("username");
		String password1=request.getParameter("password");
	
			UserAccountDao u=new UserAccountDao();
		
			 int status=0;
		     status=u.validate(username1,password1);
			System.out.println(status);
			 PrintWriter out=response.getWriter();
			if(status==1)
			{
				
				response.sendRedirect("Check.jsp");
				
			}
			else
			{
				response.sendRedirect("phones.jsp");
			}
			return m;
	}
  }

