package com.veritis.spring.mvc3;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/sample")
public class SampleController {
	
	@RequestMapping(method=RequestMethod.GET,value="/add")
	public String add(Model model,HttpServletRequest req){
		model.addAttribute("message", "Hello Veritis Java We are learning Spring MVC3");
		return "samplesuccess";
	}

}
