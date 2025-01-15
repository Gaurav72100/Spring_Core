package com.main;




import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entity.Employee;
import com.repo.EmployeeDao;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		EmployeeDao edaos=(EmployeeDao)app.getBean("edao");
		List<Employee> list=edaos.getAllEmp();
		for(Employee ep:list) {
			System.out.println(ep);
		}

	}

}
