package com.examples.java.EmployeeMain;

import com.examples.java.EmployeeService.EmployeeService;

public class EmployeeMain {

	public static void main(String[] args) throws InterruptedException {
		
		EmployeeService e = new EmployeeService();
		e.start();

	}

}