package com.oops;

public class Emp {
	   int empid;
	   String empname;
	   String department;
	   int salary;
	   public Emp(int eempid, String eempname,String edepartment,int esalary) {
		   empid=eempid;
		    empname=eempname;
		    department=edepartment;
		   salary = esalary;
	   }
public void display() {
	System.out.println("Empid :"+empid);
	   System.out.println("Name:"+ empname);
	   System.out.println("Department :" +department);
	   System.out.println("salary :"+ salary);
}
	public static void main(String[] args) {
      Emp emp1=new Emp(101,"ravi","HR",35000);
      Emp emp2=new Emp(102,"priya","deveplor",55000);
      Emp emp3=new Emp(103,"kiran","testing",42000);
      
       emp1.display();
       System.out.println("\n");
       emp2.display();
       System.out.println("\n");
       emp3.display();
	}

}
