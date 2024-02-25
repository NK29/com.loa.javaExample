package com.lao.Exception_Handling;

public class FinallyBlock_Thread_Dead {
	
	public static int dummy() {
		return 3;
	}

	public static void main(String[] args) {
		
		System.out.println(2/0);
	}

}
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//Thread Dead