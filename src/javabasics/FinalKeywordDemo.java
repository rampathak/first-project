package javabasics;

class Test {
	final int x=100; // constant value - we cant change it
	
	// if it is final then you have to assign some value during declaration
}

public class FinalKeywordDemo {
	
	public static void main(String[] args) {
		
		Test test = new Test();
				test.x=100;   //cannot assign value as x is incorrect
		System.out.println(test.x);
		
	}

}
