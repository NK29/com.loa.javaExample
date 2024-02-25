package com.lao.Exception_Handling;

public class SingleTryCatchExamples {

	public static void main(String[] args) {
		try {
			int number1 = 2;
			int number2 = 3;
			int result = number2/number1;
			System.out.println(result);
		}
		catch (ArithmeticException e) {
			System.out.println("Dont divide a number by zero");
		}
		catch (NullPointerException e) {
			System.out.println("This is due to null pointer exception");
		}
		catch (Exception e) {
			System.out.println("Drink a lemon juice and don't divide a number by zero");
		}

	}

}
