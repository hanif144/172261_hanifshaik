package com.spring.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.han.dao.UserAccountDao;
import com.han.pojo.UserValues;





@Controller
public class RegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;

UserAccountDao v=new UserAccountDao();

@RequestMapping(value = "reg", method = RequestMethod.POST)
public ModelAndView getRegister(HttpServletRequest request, HttpServletResponse response) {
		
	ModelAndView m =new ModelAndView();
		HttpSession s=request.getSession();
		String username=request.getParameter("username");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String repassword=request.getParameter("repassword");
		UserAccountDao v=new UserAccountDao();
		UserValues s1 =new UserValues(username,email,password,repassword);
		try {
			v.insert(s1.getUsername(),s1.getEmail(),s1.getPassword(),s1.getRepassword());
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
		return m;
		
}
}

