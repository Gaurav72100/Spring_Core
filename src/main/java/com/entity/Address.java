package com.entity;

public class Address {

       private	String city;
	   private String state;
	   
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

	     public void TurnOn() {
		   System.out.println("Should Turn On address");
	   }
	   public void TurnOff() {
		   System.out.println("Turn Off the Address()");
	   }

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + "]";
	}
	  
	   
}
