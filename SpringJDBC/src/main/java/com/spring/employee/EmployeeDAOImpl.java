package com.spring.employee;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class EmployeeDAOImpl implements EmployeeDAO{
	  private JdbcTemplate jdbcTemplate;
	    
	    public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
	        this.jdbcTemplate = jdbcTemplate;
	    }

	    @Override
	    public String getEmployee(Integer id) {
	    	String sql = "select name from employee1 where id = ?";
	    	String name = jdbcTemplate.queryForObject(sql,new Object[]{id},String.class);
	    	return name;
	    }
	    
		@Override
		public void insert(Integer id, Integer age, String name) {
			 String SQL = "insert into employee1 (id, age, name) values (?, ?, ?)";
		        jdbcTemplate.update( SQL, id,age,name);
		        System.out.println("Created Record ID = "+id+" Name = " + name + " Age = " + age);
		        return;
			
		}

}
