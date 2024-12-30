package com.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;




@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class LazyEmployee {
	
	private int id=102;
	private String name="Gautam Buddh";
	private int salary=100000;
	
	public LazyEmployee() {
		System.out.println("Lazy Employee called.....");
	}
	
	@Autowired
	@Lazy
	private Address address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	

}
