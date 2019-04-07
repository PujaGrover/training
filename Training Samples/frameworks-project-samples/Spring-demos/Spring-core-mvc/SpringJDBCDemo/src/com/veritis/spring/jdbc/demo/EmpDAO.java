package com.veritis.spring.jdbc.demo;



import java.util.List;

import com.veritis.spring.jdbc.demo.domain.Emp;

public interface EmpDAO {

	public void insertemp(Emp emp);
	public List<Emp> selectemps(double sal);
    public Emp selectemp(int empId);
	
}
