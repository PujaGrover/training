package com.veritis.spring.mvc3.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.veritis.spring.mvc3.domain.Child;
import com.veritis.spring.mvc3.domain.Emp;
@Service(value="employeeService")
public class EmployeeServiceImpl implements EmployeeService {

	@Override
	@Transactional
	public Emp getEmpById(Integer empno) {
		Emp emp=new Emp();
		if(empno==111){
			emp.setEmpno(111);
			emp.setEname("XXXXXX");
			emp.setSal(4500.23);
		}
		return emp;
	}

	@Override
	@Transactional
	public List<Emp> getAllEmp() {
		List<Emp> emps=new ArrayList<Emp>();
		Emp emp=new Emp();
		emp.setEmpno(111);
		emp.setEname("XXXXXX");
		emp.setSal(4500.23);
		emps.add(emp);
		
		emp=new Emp();
		emp.setEmpno(222);
		emp.setEname("YYYYYYY");
		emp.setSal(2340.23);
		emps.add(emp);
		
		emp=new Emp();
		emp.setEmpno(333);
		emp.setEname("ZZZZZZ");
		emp.setSal(5500.23);
		emps.add(emp);
		
		emp=new Emp();
		emp.setEmpno(444);
		emp.setEname("WWWWWW");
		emp.setSal(6300.23);
		emps.add(emp);
		
		emp=new Emp();
		emp.setEmpno(555);
		emp.setEname("VVVVVVV");
		emp.setSal(6300.23);
		emps.add(emp);
		return emps;
	}

	@Override
	public List<Child> getChildren(Emp e) {
		List<Child> childList=new ArrayList<Child>();
		Child c;
		if(e.getEmpno()==111){
			c=new Child();
			c.setChildid(1111);
			c.setName("AAAA");
			c.setAge(3);
			childList.add(c);
			c=new Child();
			c.setChildid(2222);
			c.setName("BBBB");
			c.setAge(4);
			childList.add(c);
			c=new Child();
			c.setChildid(3333);
			c.setName("CCCC");
			c.setAge(5);
			childList.add(c);
		}
		return childList;
	}

}
