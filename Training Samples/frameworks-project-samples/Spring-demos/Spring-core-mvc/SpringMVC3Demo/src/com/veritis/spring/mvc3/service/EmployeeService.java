package com.veritis.spring.mvc3.service;

import java.util.List;

import com.veritis.spring.mvc3.domain.Child;
import com.veritis.spring.mvc3.domain.Emp;

public interface EmployeeService {
public Emp getEmpById(Integer empno);
public List<Emp> getAllEmp();
public List<Child> getChildren(Emp e);
}
