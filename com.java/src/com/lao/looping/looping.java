package com.lao.looping;

	public class looping{
		
	/* write an imposition
	 "I can program! I can learn"- 25 times*/
	

	public static void main(String[] args) {
		//for loop initailization;condition;increment/decrement
		/*for(int times=0;times<=25;times++) {
			System.out.println("I can program! I can learn");
		}
	
		int times=0;
		while (times<=25) {
			System.out.println("I can program! I can learn");
			times++;
		}}*/
		
		int times=0;
		do {
			System.out.println("I can program! I can learn");
			times++;
		}while (times<=25);
	}}