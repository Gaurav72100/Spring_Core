package com.repo;

import com.model.Employee;

public interface EmployeeDao {

	public int saveEmp(Employee e);
	public int updateEmp(Employee e);
	//public int deleteEmp(Employee e);
}
