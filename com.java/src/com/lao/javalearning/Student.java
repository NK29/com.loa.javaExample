package com.lao.javalearning;

public class Student {
	String student_name;
	int rollNo;
	
	/*Example for default constructor.
	Do you see any constructor here? Nope! Then you have no special powers.
	Complier has created one here!! Believe me!!*/

	
	public static void main(String[] args) {
		//ClassName objName = new ClassName();
		Student student = new Student();
		System.out.println(student.student_name);
		System.out.println(student.rollNo);
	}

}
 