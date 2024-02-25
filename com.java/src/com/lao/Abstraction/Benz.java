package com.lao.Abstraction;

public class Benz extends Car{
	
		@Override
		public void enginesecret() {
			System.out.println("Benz engine secret");
		}
		
		@Override
		public void companyvault() {
			System.out.println("Benz company vault");
		}

	 
	public static void main(String[] args) {
		Car car = new Benz();
		car.enginesecret();
		car.companyvault();
		
	}
	}