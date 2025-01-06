package com.entity;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;



@Component
public class Address {

	private String companyName="CompanyName";
	
	@Value("${common.state}")
	private String state;
	
	//@Value("${common.city1:defaultcity}")
	private String city;
	
	//@Value("$(COMPUTERNAME)")
	private String path;
	
	@Value("$(listOfValues)")
	private String[] block;
	
	@Value("$(valuesMap)")
	private Map<String , Integer> valueOfMap;
	
	
	public Address() {
		System.out.println("Address called");
	}
	public String getcompanyName() {
		return companyName;
	}
	@Override
	public String toString() {
		return "Address [companyName=" + companyName + ", state=" + state + ", city=" + city + ", path=" + path
				+ ", block=" + Arrays.toString(block) + ", valueOfMap=" + valueOfMap + "]";
	}
  
	
	   
}
