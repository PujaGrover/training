package com.websystique.spring;

import java.math.BigDecimal;
import java.util.List;

import org.joda.time.LocalDate;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.websystique.spring.configuration.AppConfig;
import com.websystique.spring.model.Employee;
import com.websystique.spring.service.EmployeeService;

public class AppMain {

	public static void main(String args[]) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		EmployeeService service = (EmployeeService) context.getBean("employeeService");

		/*
		 * Create Employee1
		 */
		Employee employee1 = new Employee();
		employee1.setName("Venkata");
		employee1.setJoiningDate(new LocalDate(2010, 9, 19));
		employee1.setSalary(new BigDecimal(15000));
		employee1.setSsn("ssn00000003");

		/*
		 * Create Employee2
		 */
		Employee employee2 = new Employee();
		employee2.setName("Krishna");
		employee2.setJoiningDate(new LocalDate(2012, 11, 11));
		employee2.setSalary(new BigDecimal(25000));
		employee2.setSsn("ssn00000004");

		/*
		 * Persist both Employees
		 */
		//service.saveEmployee(employee1);
		//service.saveEmployee(employee2);

		/*
		 * Get all employees list from database
		 */
		System.out.println("all employees list");
		System.out.println("==============================");
		List<Employee> employees = service.findAllEmployees();
		for (Employee emp : employees) {
			System.out.println(emp);
		}
		System.out.println("==============================");
		/*
		 * delete an employee
		 */
		//service.deleteEmployeeBySsn("ssn00000002");

		/*
		 * update an employee
		 */
		System.out.println("Employe By SSN ssn00000003");
		Employee employee = service.findBySsn("ssn00000003");
		employee.setSalary(new BigDecimal(70000));
		service.updateEmployee(employee);

		/*
		 * Get all employees list from database
		 */
		System.out.println("all employees list");
		System.out.println("==============================");
		List<Employee> employeeList = service.findAllEmployees();
		for (Employee emp : employeeList) {
			System.out.println(emp);
		}

		context.close();
	}
}
