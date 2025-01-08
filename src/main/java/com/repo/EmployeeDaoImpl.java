package com.repo;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.model.Employee;



@Component 
public class EmployeeDaoImpl implements EmployeeDao {

	private JdbcTemplate jdbcTemplate;

	
	
	public EmployeeDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Autowired
	public EmployeeDaoImpl(DataSource dataSource) {
		super();
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public int saveEmp(Employee e) {
		String query="insert into employee(id,name,address) values('" + e.getId() + "','" + e.getName() + "','" + e.getAddress() +"')";
	
		System.out.println(query);
		return jdbcTemplate.update(query);
	}
	
	public int updateEmp(Employee e) {
		String query="update employee set name='" + e.getName() + "',salary='" + e.getSalary() + "' where id='"
				+ e.getId() + "' ";
		System.out.println("Successfully updated");
		return jdbcTemplate.update(query);
	}
	
}
