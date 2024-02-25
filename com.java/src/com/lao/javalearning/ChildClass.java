package com.lao.javalearning;

public class ChildClass extends ParentClass{
	
	public ChildClass(){
		//super(); we cannot see with nakey eye
	System.out.println("Child constructor");
	}

	public static void main(String[] args) {
		//ClassName objName = new ClassName();
		ChildClass childclass = new ChildClass();

	}
}
