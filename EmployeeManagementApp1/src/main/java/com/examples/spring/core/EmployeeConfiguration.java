package com.examples.spring.core;
import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeConfiguration {

	   @Bean("employee")
	    public Employee employee() {
	        return new Employee(1,"sahithi",address(),true);
	    }    
	    
	    @Bean
	    public Address address() {
	        return new Address("kanneluru","kadapa","India",516434);
	    } 
	    
	  
	    
}
