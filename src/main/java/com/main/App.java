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
		Employee emp = new Employee(5, "Anuj Sharma", 80000);
		//edao.saveEmployee(emp);
		
		Employee emp2 = new Employee();
		emp.setId(3);
    	//int id=edao.deleteEmployee(emp);
    	//System.out.println("Deleted Successfully"+ id);

		
		Employee emp3 = new Employee(3,"Ankush",450000);
		int update=edao.updateEmp(emp3);
		System.out.println("Successfully update"+update);
	}

}
