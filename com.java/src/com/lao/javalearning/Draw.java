package com.lao.javalearning;

public class Draw {
	String draw;
	
	Draw(){
		System.out.println("Draw object created");
	}
	
	Draw(String toDraw){
		draw = toDraw;
		System.out.println("Drawing"+toDraw);
	}

	public static void main(String[] args) {
		//ClassName objName = new ClassName();
		Draw draw = new Draw();
		Draw draw1 = new Draw("circle");
	}
}
