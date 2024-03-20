package javabasics;

public class MoneyPlant implements Plant, Tree {

	public void grow() {
	
	System.out.println("The moneyplant grows");	
		// TODO Auto-generated method stub
		
	}

	public void purifyair() {
		System.out.println("The moneyplant purifyair");
		// TODO Auto-generated method stub
		
	}

	public void takesCo2() {
		System.out.println("The moneyplant takes carbondioxide");
		// TODO Auto-generated method stub
		
	}
	
	public void throwsO2() {
		System.out.println("The moneyplant throws oxygen");
		// TODO Auto-generated method stub
		
	}

	 
	public static void main(String[] args) {
		MoneyPlant moneyplant = new MoneyPlant();
		moneyplant.grow();
		moneyplant.purifyair();
		moneyplant.takesCo2();
		moneyplant.throwsO2();
		
	}

	
}
