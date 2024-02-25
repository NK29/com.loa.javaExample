package com.lao.Abstraction;

public  class Bmv extends Car{
	
	@Override
	public void enginesecret() {
		System.out.println("BMV engine secret");
	}
	
	@Override
	public void companyvault() {
		System.out.println("BMV company vault");
	}


	public static void main(String[] args) {
		//ParentClass ref = new ChildClass();Overriding
		Car car = new Bmv();
		car.enginesecret();
		car.companyvault();

	}

}
