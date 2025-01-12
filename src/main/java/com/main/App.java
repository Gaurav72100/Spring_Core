package com.main;




import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.entity.Employee;
import com.repo.EmployeeDao;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//ApplicationContext app = new ClassPathXmlApplicationContext("application.xml");
		EmployeeDao edao = app.getBean("edao", EmployeeDao.class);
		Employee emp = new Employee(3, "vipul", 80000);
    	edao.saveEmployee(emp);

	}

}
