package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.configuration.AppConfig;
import com.entity.Parent;
import com.entity.*;

public class App2 {

	public static void main(String[] args) {
		
		ApplicationContext app = new AnnotationConfigApplicationContext(AppConfig.class);
		
		/*
		Parent pn = (Parent)app.getBean(Parent.class);
		System.out.println(pn);
		
		System.out.println();
		
		pn.setName("Amit Kumar");
		pn.getChild().setName("Vikram");
		System.out.println(pn);
		
		*/
		
		/*--------Lookup----------------------*/
		
		ParentLookup bean = (ParentLookup)app.getBean(ParentLookup.class);
		System.out.println(bean);
//		System.out.println(bean);
//		System.out.println(bean); 
		
		
		System.out.println(bean.getChildDetail());
		
		System.out.println("abstract method: "+bean.getChildDetail());
		System.out.println("--------Lookup.2---------");

		bean = app.getBean(ParentLookup.class);
		System.out.println(bean);
		System.out.println(bean.getChildDetail());
		System.out.println(bean.getChildDetail());

	}

}
