package com.lao.javalearning;

public class Employee {
	int employeeId;
	String employeeName;
	//Define no argument constructor or non arg constructor
	
	//user defined constructor 
	Employee(){
		employeeId=1;
		employeeName="Naveen";
		System.out.println("Employee object is created");
	}

	public static void main(String[] args) {
		//ClassName objName = new ClassName();
		Employee Employee = new Employee();
	}

}
