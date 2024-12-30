package com.main;




import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entity.Address;
import com.entity.Employee;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Employee emp = app.getBean(Employee.class);
		
//		emp.setName("Vivek");
//		emp.getIaddress().setCity("Aligarh");
		
		System.out.println(emp);

	}

}
