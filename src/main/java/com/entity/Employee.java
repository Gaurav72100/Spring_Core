package com.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;




@Component
public class Employee  {

	private int id=105;
	private String name="Atul";
	
//	@Autowired
//
//	@Qualifier(value = "address1")
	private IAddress iaddress;
	
	public Employee() {}
	
	

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		
	}
	
	
	public Employee(IAddress iaddress) {
		this.iaddress=iaddress;
	}



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

	public IAddress getIaddress() {
		return iaddress;
	}


	@Autowired

	@Qualifier(value = "address1")

	public void setIaddress(IAddress iaddress) {
		System.out.println("called...........");
		this.iaddress = iaddress;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", iaddress=" + iaddress + "]";
	};
	
	
	
}
