package com.entity;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Employee {

	private int id=101;
	private String name="Amit";
	
	
	@Autowired
     private Address address;

     public void turnOn() {
    	 System.out.println("On method....");
     }
	
     public void turnOff() {
    	 System.out.println("Off Method...");
     }
     
     public Employee() {
    	 System.out.println("Employee called");
     }
     
     public Employee(Address address) {
    	 this.address=address;
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
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("Address called()");
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	
}
