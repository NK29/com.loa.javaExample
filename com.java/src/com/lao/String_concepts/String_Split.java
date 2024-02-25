package com.lao.String_concepts;

public class String_Split {

	public static void main(String[] args) {
		//Split
		String splitThis = "Am,I,teaching,good?";
		String[] splittedwords = splitThis.split(",");
		for (String string: splittedwords) {
			System.out.println(string);
		}
	}

}
