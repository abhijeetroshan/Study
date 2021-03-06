package com.cg.assignment;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;


public class EmployeeMain 
{
	public static void main(String arg[])
	{
		XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("demo.xml"));
		Employee emp =  (Employee) factory.getBean("employeeLab1.1");
		System.out.println("Employee Details");
		System.out.println("-------------------------");
		System.out.println("Employee ID: " +emp.getEmployeeId());
		System.out.println("Employee Name: " +emp.getEmployeeName());
		System.out.println("Employee Salary: " +emp.getSalary());
		System.out.println("Employee BU: " +emp.getBusinessUnit());
		System.out.println("Employee Age: " +emp.getAge());
	}
}
