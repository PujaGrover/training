package com.veritis.spring.jdbc.demo;



import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.veritis.spring.jdbc.demo.domain.Emp;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		EmpDAO empDAO = (EmpDAO) context.getBean("empDAO");
Emp springemp = new Emp(1215,"Bhanu", "Application Dev", 9500.0);
	empDAO.insertemp(springemp);
	
	
		List<Emp>emps=empDAO.selectemps(5000);
                for (Emp emp : emps) {
                    System.out.println("-----------------------------");
                    System.out.println(emp);
                }
                
                
                
                Emp e=empDAO.selectemp(1211);
                System.out.println("-----------------------------");
                System.out.println("-----------------------------");
                System.out.println("We got Emp Objects ");
                System.out.println("-----------------------------");
                System.out.println("-----------------------------");
                System.out.println(e);
		         // System.out.println(" We inserted the record successfully");
	}
	
}
