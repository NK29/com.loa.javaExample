package com.lao.Exception_Handling;

public class TryCatchFinally_Return_Break_Continue {

	public static int dummy() {
		return 3;
	}
	
	public static void main(String[] args) {
		
		try {
			System.out.println("Inside try block");
			System.out.println(TryCatchFinally_Return_Break_Continue.dummy());
			System.out.println("After exception");
		}
		catch(Exception e) {
			System.out.println("Inside catch block");
		}
		finally {
			System.out.println("Inside finally block");
		}
	}
}
