package com.lao.javalearning;

public class BankAccount {
	Long accountNumber=1234567890l;
	String holderName="Naveen";
	Integer accountBalance=10000;
	
	public void getBalance() {
		System.out.println("Balance is: "+ accountBalance); 
	}

	public static void main(String[] args) {
		// ClassName objName = new ClassName();
		BankAccount account = new BankAccount();
		account.getBalance();
	}
}
