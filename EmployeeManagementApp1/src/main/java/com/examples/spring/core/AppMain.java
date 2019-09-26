package com.examples.spring.core;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


public class AppMain {

	public static void main(String[] args) {
		// Assemble the objects
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfiguration.class);

		Employee obj = (Employee) context.getBean("employee");
		

		Address obj1 = (Address) context.getBean("address");
		
		List<String> l1=new ArrayList<String>();
		l1.add("dataStructures");
		l1.add("c");
		obj.setSkills(l1);
		obj.setJoiningDate(LocalDate.now());
 //		System.out.println("CommonMan: " + obj1);
//		
//		Person obj2 = (Person) context.getBean("superMan");
//		System.out.println("SuperMan: " + obj2);
//		
////		obj.getPerson().setName("Anand");
////		obj.getPerson().setAge(40);
////		obj.getPerson().setLocation("Cochin");
//		
		System.out.println(
				
		"Id:"+obj.getId()+"\n"+	"Name:"+obj.getName()+"\n" + "Street:" +obj.getAddress().getStreet() + "\n" +"City:"+ obj.getAddress().getCity() + "\n" +"Country:" + obj.getAddress().getCountry()+"\n"+"LocalDate:"+obj.getJoiningDate()+"\n"+"List of skills:"+obj.getSkills()+"\n"+"Is Active:"+obj.isActive());		

//		context.registerShutdownHook();
	}
}
