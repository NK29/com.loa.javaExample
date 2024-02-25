package com.lao.static_keyword;

public class StaticBlock {
	
	
	static {
		System.out.println("inside static block1");
	}
	static {
		System.out.println("inside static block2");
	}

	public static void main(String[] args) {
		System.out.println("inside main method");
	}

}
