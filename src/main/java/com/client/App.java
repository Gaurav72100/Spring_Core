package com.client;




import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.config.AppConfig;
import com.entity.Employee;
import com.repo.EmployeeDao;
import com.repo.EmployeeDaoImpl;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext app = new AnnotationConfigApplicationContext(AppConfig.class);
		
		EmployeeDao dao = app.getBean(EmployeeDaoImpl.class);
		
		Employee emp = new Employee(1000,"Rakesh Rajan","Mathura");
		//dao.updateEmp(emp);
		
		
		System.out.println("Successfully compiled");

	}

}
