package com.veritis.spring.di.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service(value="employee")
public class EmployeeServiceImpl implements EmployeService {
	//@Value("${pers.sal}")
	int sal;
	
	@Resource(name="sal")
	//@Autowired
	public void setSalary(String sal) {
		this.sal = Integer.parseInt(sal);
		//this.sal=sal;
	}
	
	public void setXYZ(String xyz){
		
	}
	@Override
	@Transactional
	public void setSalAdjustment(int amt) {
		sal+=amt;

	}

	@Override
	@Transactional
	public Integer getSalary() {
		return sal;
	}

}
