/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.veritis.spring.hibernate;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author vsaranu
 */
public class EmployeeClient {
    private static ApplicationContext ctx;
    static {
        ctx = new ClassPathXmlApplicationContext("hibernatespring.xml");
    }
    public static void main(String[] args) {
       EmployeeDAO dao=(EmployeeDAO)ctx.getBean("employeeDAO",EmployeeDAO.class);

  Emp e=dao.find(new Integer(1202));
//
    System.out.println("Emp no"+e.getEmpno());
     System.out.println("Emp Name "+e.getName());
     System.out.println("Sal "+e.getSalary());
     System.out.println("Job "+e.getDesig());
    Emp emp=new Emp();
    emp.setEmpno(new Integer(1216));
    emp.setName("sageit 10");
    emp.setDesig("spring int dev");
    emp.setSalary(6000.0);
//    	
   dao.saveOrUpdate(emp);
       List emps=dao.findAll(Emp.class);
        for (Object object : emps) {
            Emp e1=(Emp)object;
            System.out.println(e1);
       }
    }
}
