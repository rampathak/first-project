package javabasics;

import java.util.Scanner;

public class IfElse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age;
		System.out.println("Enter Age");
		age = sc.nextInt();

		if (age < 13) {
			if (age < 6) {
				System.out.println("Small children");
			} else {
				System.out.println("Big Child");

			}

		} else if (age > 12 && age < 21) {
			if (age < 18) {
				System.out.println("Teen Age");
			}

			else {
				System.out.println("Young Age");

			}

		} else {
			System.out.println("Adult");
		}
	}
}
