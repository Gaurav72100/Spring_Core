package com.entity;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component(value="address1")
//@Primary
public class Address implements IAddress {

	  private String city="Lucknow";
	  private String state ="Uttar Pradesh";
	  
	  public Address() {
		  
	  }

	@Override
	public String getCity() {
		
		return city;
	}

	
	public void setCity(String city) {
		this.city=city;
		
	}

	
	public String getState() {
		
		return state;
	}

	
	public void setState(String state) {
		this.state=state;
		
	}


	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + "]";
	}
	  
	   
}
