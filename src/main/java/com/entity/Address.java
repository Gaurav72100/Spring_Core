package com.entity;

import org.springframework.stereotype.Component;

@Component
public class Address {

       private	String city="city";
	   private String state="state";
	   
	   Address(){
		   System.out.println("Address Constructor Called()");
	   }
	   
	   public String getCity() {
		return city;
	   }
	   
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}


	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + "]";
	}
	  
	   
}
