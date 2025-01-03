package com.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;



@Component
abstract  public class ParentLookup {
	
	private String name;
	
	public ParentLookup() {
		System.out.println("ParentLookup constructor called");
	}
	
	
	@Lookup
	abstract public Child getChildDetail();
	
	@Autowired
   private	Child child;

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
	
	
	

}