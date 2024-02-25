package com.lao.javalearning;
              //ClassName
public class collectAmount {
	public Integer collectedAmount=1000;
	public Integer collectAmountAndGiveItToMe() {
		System.out.println("Daddy have collected Rupees: "+collectedAmount+" And sent it to you");
		return collectedAmount;
	}
	public static void main(String[] args) {
		//ClassName objName = new ClassName();
		collectAmount myson = new collectAmount();
	//objName
		Integer amount = myson.collectAmountAndGiveItToMe();
		System.out.println("Got the amount son: "+amount);
	}
}
