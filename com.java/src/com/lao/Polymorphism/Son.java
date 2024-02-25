package com.lao.Polymorphism;

public class Son extends Parents {
	/* This class is to illustrate method overriding
	  with a practical example
	*/
	
	@Override
	public void marriage() throws Exception{
		System.out.println("Nope! My marriage My rights!");
	}

	
	public static void main(String[] args)throws Exception {
//ParentsClass ref = new ChildClass(); 	
	Parents parents = new Son();
	parents.properties();
	parents.marriage();
	}

}
