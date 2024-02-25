package com.lao.conditional_statements;

public class SuperHeroOrNot {
	
	String hero="Super Man";
	
	public void heroOrNot() {
		switch (hero) {
		case "Iron Man":
			System.out.println("Iron Man is a super hero");
			break;
		case "Super Man":
		System.out.println("Super Man is a super hero");
		break;
		case "Bat Man":
		System.out.println("Bat Man is a super hero");
		break;
		default:
			System.out.println(hero+" is not a super hero");
		}
	}

	public static void main(String[] args) {
		// ClassName objName = new ClassName();
		SuperHeroOrNot hero = new SuperHeroOrNot();
		hero.heroOrNot();

	}

}
