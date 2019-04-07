package com.veritis.springmvc.multiaction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class MultiController extends MultiActionController {

	public ModelAndView add(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
			
			return new ModelAndView("CustomerPage", "msg","multi controller  ------  add() method");
				
		}
	
	public ModelAndView delete(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
			
			return new ModelAndView("CustomerPage", "msg","multi controller  ------  delete() method");
				
		}
	
	
	public ModelAndView update(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
			
			return new ModelAndView("CustomerPage", "msg","multi controller  ------  update() method");
				
		}
	
	public ModelAndView list(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
			
			return new ModelAndView("CustomerPage", "msg","multi controller   ------  list() method");
				
		}
}
