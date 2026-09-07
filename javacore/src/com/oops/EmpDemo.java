package com.oops;

public class EmpDemo {
     int emp_id;
     String emp_name;
     {
    	 String  com_name = "codegnan";
    	 System.out.println(com_name);
     }
     static{
    	 System.out.println("Emp details");
     }
	public static void main(String[] args) {
		 
         EmpDemo emp1 = new EmpDemo();
         emp1.emp_id = 101;
         emp1.emp_name = "geeta";
         EmpDemo emp2 = new EmpDemo();
         emp2.emp_id = 102;
         emp2.emp_name = "ramu";
         EmpDemo emp3 = new EmpDemo();
         emp3.emp_id = 103;
         emp3.emp_name = "lipika";
         System.out.println(emp1.emp_id +" "+ emp1.emp_name);
         System.out.println(emp2.emp_id +" "+ emp2.emp_name);
         System.out.println(emp3.emp_id +" "+ emp3.emp_name);
         
         
         
	}

}
