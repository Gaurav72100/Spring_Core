package com.client;




import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entity.Employee;
import com.repo.EmployeeDao;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		EmployeeDao dao = (EmployeeDao)context.getBean("edao");
		
		Employee e1 = new Employee(12,4000,54,"Amit");
		Boolean emp=dao.saveEmployeeByPreparedStatement(e1);
		System.out.println("Added Succesfully........"+emp);
		

	}

}
