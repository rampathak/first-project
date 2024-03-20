
//method overloading is basically having exact same name but having different parameters
package javabasics;

import java.util.Random;

public class MethodOverloading {

	public static void main(String[] args) {
	int result=	addNumbers(6,7);
	System.out.println(result);
	double result1=	addNumbers(6.5, 7.5);
	System.out.println(result1);
	double result2= addNumbers(1.5,2.5,3.5);
	System.out.println(result2);
	
	addNumbers();

	}
	
	public static int addNumbers(int a, int b) {
		return a+b;
	}
	public static double addNumbers(double a, double b) {
		return a+b;
	}
	
	public static double addNumbers(double a, double b, double c) {
		return a+b+c;
	}
	
	public static void addNumbers() {
		Random r = new Random();
		System.out.println(r.nextInt(7)+r.nextInt(10));
	}

}
