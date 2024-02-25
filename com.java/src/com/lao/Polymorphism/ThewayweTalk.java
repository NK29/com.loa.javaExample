package com.lao.Polymorphism;

public class ThewayweTalk {
	/*This class is to illustrate method overloading
	 with a practical example */
	
	public void talk(Parents speakingstyle) { 
		System.out.println("polite and respectfull??");
	}
	
public void talk(Partner speakingstyle) { 
	System.out.println("love, romantic and a mixture of everything");
	}
public void talk(Boss speakingstyle) { 
	System.out.println("nothing personal, pure business");
}
	
	public static void main(String[] args) {
		ThewayweTalk talk = new ThewayweTalk();
		
		Parents parents = new Parents();
		talk.talk(parents);
		
		Partner partner = new Partner();
		talk.talk(partner);
		
		Boss boss = new Boss();
		talk.talk(boss);
	}

}
