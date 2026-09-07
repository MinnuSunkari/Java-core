package com.javabasic;

public class EmploteeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e= new Employee(123,"kavya");
		Employee e1= new Employee(124,"davya");
		Employee e2= new Employee(125,"bavya");
		Employee e3= new Employee(126,"tavya");
		Employee e4= new Employee(127,"havya");
		Employee emps[] = {e,e1,e2,e3,e4};
		for(Employee ee:emps) {
			System.out.println(ee);
		}

	}

}
