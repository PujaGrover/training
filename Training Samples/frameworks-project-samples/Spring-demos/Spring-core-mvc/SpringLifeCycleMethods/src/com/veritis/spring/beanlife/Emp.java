package com.veritis.spring.beanlife;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Emp implements InitializingBean,DisposableBean {
	String empno;
	String ename;

	public String getEmpno() {
		return empno;
	}

	public void setEmpno(String empno) {
		System.out.println("Enetred into setEmpno() ");
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		System.out.println("Enetred into setEname() ");
		this.ename = ename;
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Before Destroy");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("After setting all the properties");
		
	}
}
