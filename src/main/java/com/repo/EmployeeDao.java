package com.repo;

import org.springframework.jdbc.core.JdbcTemplate;

import com.entity.Employee;

public class EmployeeDao {

	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate=jdbcTemplate;
	}
	
	
	public int saveEmployee(Employee e) {
		String query = "insert into employee (id,name,salary) values('" + e.getId() + "','" + e.getName() + "','" + e.getSalary() + "')";
		System.out.println(query);
		return jdbcTemplate.update(query);
	}
	
	public int deleteEmployee(Employee e) {
		String query = "delete from employee where id='"+e.getId()+"'";
		return jdbcTemplate.update(query);
	}
	
	public int updateEmp(Employee e) {
		String query ="update employee set name='"+e.getName()+"' ,salary='"+e.getSalary()+"' where id='"+e.getId()+"'";
		return jdbcTemplate.update(query);
	}
}
