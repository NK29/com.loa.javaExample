package com.lao.Exception_Handling;

public class You {
	
	/* On a fine evening, a guy is giving faces to his upset girlfriend
	 * When she is at her balcony to make her laugh.
	 * Her brother noticed this and came to beat him.-->Exception
	 * How to handled this?
	 */
	
	public void makeYourGirlLaugh() {
		
		try {
			throw new MachanInterruptedException("Machan is coming to hit you");
		} catch (MachanInterruptedException e) {
			
			//e.printStackTrace();
			System.out.println("Your friend: Machan give this pose da.");
			System.out.println("and you are acting like you are posing for Instagram");
		}
		
	}
	
	public static void main(String[] args) {
		You you = new You();
		you.makeYourGirlLaugh();
	}

}