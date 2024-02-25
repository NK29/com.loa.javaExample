package com.lao.static_keyword;

public class StaticVariables {
	/*example to show, static variables are shared among objects.*/

	static int accountBalance=0;
	String depositedBy;
	public static void main(String[] args) {
		
		StaticVariables object1 = new StaticVariables();
		object1.accountBalance=1000;
		object1.depositedBy="agni";
		
		StaticVariables object2 = new StaticVariables();
		object2.accountBalance=2000;
		object2.depositedBy="riya";
		
		System.out.println("object1 integer:"+object1.accountBalance);
		System.out.println("object1 String:"+object1.depositedBy);
		System.out.println("object1 integer:"+object2.accountBalance);
		System.out.println("object1 String:"+object2.depositedBy);
		
		
	}

}
