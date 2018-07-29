package com.spring.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.employee.EmployeeDAO;
import com.spring.employee.EmployeeDAOImpl;

@Configuration
public class SpringJDBCConfig {
	@Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        //MySQL database we are using
        dataSource.setDriverClassName("org.hsqldb.jdbcDriver");
        dataSource.setUrl("jdbc:hsqldb:hsql://localhost/");//change url
        dataSource.setUsername("SA");//change userid
        dataSource.setPassword("");//change pwd

        return dataSource;
    }
 
    @Bean
    public JdbcTemplate jdbcTemplate() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource());
        return jdbcTemplate;
    }
 
    @Bean
    public EmployeeDAO employeeDAO(){
        EmployeeDAOImpl empDao = new EmployeeDAOImpl();
        empDao.setJdbcTemplate(jdbcTemplate());
        return empDao;
    }

}
