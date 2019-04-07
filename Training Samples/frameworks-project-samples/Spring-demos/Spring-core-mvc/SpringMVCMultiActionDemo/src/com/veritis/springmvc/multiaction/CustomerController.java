package com.veritis.springmvc.multiaction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class CustomerController extends MultiActionController{
	
	public ModelAndView testaddCustomer(HttpServletRequest request,
		HttpServletResponse response) throws Exception {
		
		return new ModelAndView("CustomerPage", "msg","testaddCustomer() method");
			
	}
	
	public ModelAndView testdeleteCustomer(HttpServletRequest request,
		HttpServletResponse response) throws Exception {
			
		return new ModelAndView("CustomerPage", "msg","testdeleteCustomer() method");
				
	}
	
	public ModelAndView testupdateCustomer(HttpServletRequest request,
		HttpServletResponse response) throws Exception {
			
		return new ModelAndView("CustomerPage", "msg","testupdateCustomer() method");
				
	}
	
	public ModelAndView testlistCustomer(HttpServletRequest request,
		HttpServletResponse response) throws Exception {
				
		return new ModelAndView("CustomerPage", "msg","testlistCustomer() method");
					
	}
	
	
}