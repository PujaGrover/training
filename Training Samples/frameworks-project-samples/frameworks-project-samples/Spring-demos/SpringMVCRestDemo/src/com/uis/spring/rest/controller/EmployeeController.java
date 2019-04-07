package com.uis.spring.rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.uis.spring.rest.model.Employee;
import com.uis.spring.rest.model.Student;

@Controller
@RequestMapping("/emp")
public class EmployeeController {

	@RequestMapping(value="/findchild",method={RequestMethod.POST})
	public @ResponseBody List<Student> getChildren(@RequestBody Employee employee){
		List<Student> students=new ArrayList<Student>();
		Student student;
		if(employee.getEmpno()==111){
			student=new Student();
			student.setStudid(1111);
			student.setStudName("XXXX");
			student.setClassid("IX");
			students.add(student);
			
			student=new Student();
			student.setStudid(2222);
			student.setStudName("YYYY");
			student.setClassid("X");
			students.add(student);
			
			student=new Student();
			student.setStudid(3333);
			student.setStudName("ZZZZ");
			student.setClassid("XI");
			students.add(student);
		}
		return students;
	}
	@RequestMapping(value="/getEmp/{empid}", method=RequestMethod.GET)
	public @ResponseBody Employee getEmployee(@PathVariable(value="empid") int empid) throws Exception{
		Employee e=new Employee();
		//System.out.println(5/0);
		e.setEmpno(empid);
		e.setEname("Test");
		e.setDesig("Java Dev");
		e.setSalary(4563.23);
		return e;
	}
}
