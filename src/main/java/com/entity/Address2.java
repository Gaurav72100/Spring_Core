package com.entity;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;



@Component(value="address2")
@Primary
public class Address2 implements IAddress {

	
	private String city="Shimla";
	private String state="Himachal Pradesh";
	
	
	public Address2() {
		
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
		return "Address2 [city=" + city + ", state=" + state + "]";
	}
	
	
	
}
