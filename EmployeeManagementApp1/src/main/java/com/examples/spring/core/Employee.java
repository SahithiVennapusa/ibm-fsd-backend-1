package com.examples.spring.core;

import java.time.LocalDate;
import java.util.List;

public class Employee {
		int id;
		String name;
		Address address;
		LocalDate joiningDate;
		List<String> skills;
		boolean isActive;
		
		public Employee(int id,String name,Address address,boolean isActive)
		{
			this.id=id;
			this.name=name;
			this.address=address;
			this.joiningDate=joiningDate;
			this.skills=skills;
			this.isActive=isActive;
		}
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Address getAddress() {
			return address;
		}
		public void setAddress(Address address) {
			this.address = address;
		}
		public LocalDate getJoiningDate() {
			return joiningDate;
		}
		public void setJoiningDate(LocalDate joiningDate) {
			this.joiningDate = joiningDate;
		}
		public List<String> getSkills() {
			return skills;
		}
		public void setSkills(List<String> skills) {
			this.skills = skills;
		}
		public boolean isActive() {
			return isActive;
		}
		public void setActive(boolean isActive) {
			this.isActive = isActive;
		}
		
		
}
