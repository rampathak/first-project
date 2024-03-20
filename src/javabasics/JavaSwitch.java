package javabasics;

import java.util.Scanner;

public class JavaSwitch {

	public static void main(String[] args) {
		int time;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Time 6 13 or 18");
		time=sc.nextInt();

		switch (time) {
		case 6:
			System.out.println("It is  morning 6 ");
			break;

		case 13:
			System.out.println("Day Time 13");
			break;

		case 18:
			System.out.println("Evening 18");
			break;

		default:
			System.out.println(" Incorrect Number Please input either 6 13 or 18");

		}
	}
}
