package com.veritis.spring.mvc3;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.veritis.spring.mvc3.domain.Emp;

@Controller
@RequestMapping("/emp")
public class EmployeeController {
	
	@RequestMapping(value="/newemp",method=RequestMethod.GET)
	public String employeeGet(HttpServletRequest request,Model model){
		Emp e = new Emp();
		model.addAttribute("empForm", e);
		return "employeeform";
	}
	
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public String register(@ModelAttribute("empForm") Emp emp,Model model){
		model.addAttribute("emp",emp);
		return "success";
	}

}
