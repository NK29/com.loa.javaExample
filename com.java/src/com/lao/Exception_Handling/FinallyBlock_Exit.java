package com.lao.Exception_Handling;

public class FinallyBlock_Exit {
	
	public static int dummy() {
		return 3;
	}
	
	public static void main(String[] args) {
		
			try {
				System.out.println("Inside try block");
				System.exit(0);
				System.out.println(2/0);
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
//System.exit