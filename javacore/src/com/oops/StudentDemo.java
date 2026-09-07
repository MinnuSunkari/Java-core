package com.oops;

public class StudentDemo {
	int id;
	String name;
	static  String inst ="codegnan";
  public static void main(String[] args) {
		
      StudentDemo stu1=new StudentDemo();
        stu1.id = 101;
        stu1.name = "kavya";
        StudentDemo stu2 = new StudentDemo();
        stu2.id = 102;
        stu2.name = "divya";
        System.out.println(stu1.id+" "+stu1.name);
        System.out.println(stu2.id+" "+stu2.name);
	}

}
