package com.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Parent {

       private	String name;
       
       public Parent() {
    	   System.out.println("Parent contructor called");
       }
       
      // @Autowired
       Child child;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Child getChild() {
		return child;
	}

	public void setChild(Child child) {
		this.child = child;
	}

	@Override
	public String toString() {
		return "Parent [name=" + name + ", child=" + "child " + "]";
	}
       
       
       
}
