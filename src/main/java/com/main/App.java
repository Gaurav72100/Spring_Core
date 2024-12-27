package com.main;




import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.configuration.AppConfig;
import com.entity.Address;
import com.entity.Employee;

public class App {

	public static void main(String[] args) {
		
		//ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		ApplicationContext app = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Employee e= app.getBean(Employee.class);
		System.out.println(e);
		

	}

}
