package com.main;

import com.configuration.AppConfig;
import com.entity.LazyEmployee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App3 {

	public static void main(String[] args) {
		
		ApplicationContext app = new AnnotationConfigApplicationContext(AppConfig.class);
		
		LazyEmployee bean = app.getBean(LazyEmployee.class);
		//System.out.println(bean);
		bean.getAddress().setCity("Lucknow");;
		System.out.println(bean);

	}

}
