package com.lao.javalearning;

public class Animal {
	String animal_name;
	String animal_type;
	
	Animal(String name, String type){
		animal_name=name;
		animal_type=type;
		
	}
	public void sayAboutAnimal() {
		System.out.println("Animal name is " + animal_name+ " and Animal type is  " + animal_type);
	}

	public static void main(String[] args) {
		//ClassName objName = new ClassName();
		Animal animal1 = new Animal("duck","Onmivores");
		animal1.sayAboutAnimal();
		Animal animal2 = new Animal("Tiger","Onmivores");
		animal2.sayAboutAnimal();

	}

}
