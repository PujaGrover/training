package com.veritis.spring.mvc3;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.veritis.spring.mvc3.domain.Emp;

@Controller
@RequestMapping("/vsam")
public class SageitController {
	
	@RequestMapping(value="/welcomesageit",method=RequestMethod.GET)
	public String welcome(HttpServletRequest request,Model model){
		Emp employee = new Emp();
		employee.setEmpno(1234);
		employee.setEname("Venkata Saranu");
		employee.setSal(4500.00);
		model.addAttribute("emp",employee);
		return "success";
	}

}
