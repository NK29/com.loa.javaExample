package com.lao.String_concepts;

public class StringBufferExamples {

	public static void main(String[] args) {
		//To demonstrate the StringBuffer is MUTABLE.
		
		System.out.println("String is IMMUTABLE");
		String name = "Arya";
		System.out.println("Appending a new to original: " + name.concat("prasanth"));
		System.out.println("Original name: " + name);
		System.out.println("*******************");
		System.out.println("String is MUTABLE");
		StringBuffer name1 = new StringBuffer("Arya"); 
		System.out.println("Appending a new to original: " + name1.append("Prasanth"));
		System.out.println("Original name: " + name1); 		
		
	}

}
