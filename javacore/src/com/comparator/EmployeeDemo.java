package com.comparator;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDemo implements Comparable<EmployeeDemo> {
	int empid;
	String name;
	int salary;

	public EmployeeDemo(int empid, String name, int salary) {
		this.empid=empid;
		this.name=name;
		this.salary=salary;
	}

	public static void main(String[] args) {
		List <String> elist = new ArrayList();
		EmployeeDemo e1=new EmployeeDemo(109,"lipika",30000);
		
		
		

	}
	@Override
	public String toString() {
		return "[ empid:"+empid+"name:"+name+"salary:"+salary+"]";
	}

	@Override
	public int compareTo(EmployeeDemo e1) {
		
		return this.empid-e1.empid;
	}

	

}
