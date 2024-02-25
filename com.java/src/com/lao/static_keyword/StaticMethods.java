package com.lao.static_keyword;

public class StaticMethods {
	
	public static void method1() {
		System.out.println("static method");
	}
	
	public static void nonstatic() {
		method1();
		System.out.println("non static method");
	}


	public static void main(String[] args) {
		method1();
	}

}
