package com.lao.Exception_Handling;

public class TryCatchFinallyImportantConcepts {
	
	public static int dummy() {
		return 3;
	}
	
	public static void main(String[] args) {
		
		try {
			System.out.println("Inside try block");
		}
		catch(Exception e) {
			System.out.println("Inside catch block");
		}
		finally {
			System.out.println("Inside finally block");
		}
	}
}
//No Exception Occurred in Example.