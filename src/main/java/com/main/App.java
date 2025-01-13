package com.main;




import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entity.Address;
import com.entity.PermanentAddress;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		PermanentAddress ad=context.getBean(PermanentAddress.class);
		Address a1=ad.getAdde();
		Address a2=ad.getAdde();
		
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());

	}

}
