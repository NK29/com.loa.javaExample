package com.lao.conditional_statements;

public class WhoTheHero {
	
	String myheroName="Iron man";
	
	public void superHeroGuesser() {
		if(myheroName.equalsIgnoreCase("Iron Man")) {
			System.out.println("you thought about Iron Man");
		}else if(myheroName.equalsIgnoreCase("Super Man")) {
				System.out.println("you thought about Super Man");
		}else if(myheroName.equalsIgnoreCase("Thor")){
					System.out.println("you thought about Thor");
					}else{
						System.out.println("sorry I can't guess!");

		}
	}

	public static void main(String[] args) {
		// ClassName objName = new ClassName();
		WhoTheHero hero = new WhoTheHero();
		hero.superHeroGuesser();

	}

}
