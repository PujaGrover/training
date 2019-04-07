package com.veritis.spring.mvc3;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.veritis.spring.mvc3.domain.Child;
import com.veritis.spring.mvc3.domain.Emp;
import com.veritis.spring.mvc3.service.EmployeeService;

@Controller
@RequestMapping("/sageit")
public class HelloController {

	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping(value="/welcome",method = RequestMethod.GET)
	public String printWelcome(Model model) {

		model.addAttribute("message", "Spring 3 MVC Hello World");
		return "hello";

	}
	
	@RequestMapping(value="/goodbye",method=RequestMethod.GET)
	public String bye(ModelMap model){
		model.addAttribute("msg", "Good Luck to you all!!! bye...");
		return "bye";
	}
	
	@RequestMapping(value="/show/{id}",method=RequestMethod.GET)
	public String show(ModelMap model,@PathVariable String id){
		model.addAttribute("msg", "We are using Pathvariable ID : "+id);
		return "bye";
	}
	
	@RequestMapping(value="/emp/{empno}",method=RequestMethod.GET)
	public String getEmpByNo(Model model,@PathVariable Integer empno){
		Emp e=employeeService.getEmpById(empno);
		model.addAttribute("emp", e);
		return "employee";
	}
	
	@RequestMapping(value="/emps",method=RequestMethod.GET)
	public @ResponseBody List<Emp> getAllEmp(){
		List<Emp> e=employeeService.getAllEmp();
		return e;
	}
	
	@RequestMapping(value="/children",method=RequestMethod.POST)
	public @ResponseBody List<Child> getChildren(@RequestBody Emp emp){
		List<Child> cl=employeeService.getChildren(emp);
		return cl;
	}
	
	
}