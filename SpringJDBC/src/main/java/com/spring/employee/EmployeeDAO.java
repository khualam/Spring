package com.spring.employee;

public interface EmployeeDAO {
	

	   public String getEmployee(Integer id);
	   
	   public void insert(Integer id,Integer age, String name);

}
