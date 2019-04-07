package com.veritis.springmvc.beannamed;



import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class HelloWorldController extends AbstractController{

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		ModelAndView model = new ModelAndView("HelloWorldPage");
		ArrayList<Emp> emps=new ArrayList<Emp>();
		Emp e=new Emp();
		e.setEmpno("1111");
		e.setEname("Venkata");
		e.setJob("Java Dev");
		emps.add(e);
		
		e=new Emp();
		e.setEmpno("2222");
		e.setEname("Saranu");
		e.setJob("Spring Dev");
		emps.add(e);
		
		e=new Emp();
		e.setEmpno("3333");
		e.setEname("Krishna");
		e.setJob("Hibernate Dev");
		emps.add(e);
		
		e=new Emp();
		e.setEmpno("4444");
		e.setEname("Mohan");
		e.setJob("JavaEE Dev");
		emps.add(e);
		
		model.addObject("empList", emps);
		return model;
	}

}