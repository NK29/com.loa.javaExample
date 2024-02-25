package com.lao.conditional_statements;

public class LetHaveCoffee {
	//data type boolean ---> true, false
	boolean isCupEmpty = false;

	public static void main(String[] args) {
		// ClassName objName = new ClassName();
		LetHaveCoffee coffee = new LetHaveCoffee();
		if (coffee.isCupEmpty) {
			System.out.println("Fill the cup");
		}else {
			System.out.println("Drink the coffee");
		}

	}

}
