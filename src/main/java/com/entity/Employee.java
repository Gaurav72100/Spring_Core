package com.entity;

public class Employee {

      private int id;
     private int salary;
     private int age;
     private String name;
     
     
	public Employee() {
		
	}
	public Employee(int id, int salary, int age, String name) {
		super();
		this.id = id;
		this.salary = salary;
		this.age = age;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + ", age=" + age + ", name=" + name + "]";
	}
     
     
	   
}
