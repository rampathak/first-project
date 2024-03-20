package javabasics;

import java.util.Scanner;

public class MyIfCase {
	
	public static void main(String[] args) {
		
	
	Scanner sc= new Scanner(System.in);   //System.in is a standard input stream
	
	System.out.println("Enter your age 'Range 1 to 100'");
	 int age = sc.nextInt();
	 
   if (age<18)
	   
   
   {System.out.println("You are in School");
   
   }
   
   else if (age>18 && age<21)
   {
	   System.out.println("You are in College");
	   
   }
   else if (age>21 && age<30)
   {
	   System.out.println("You are in University");
	   
   } 

   else if (age>30 && age<65)
   {
	   System.out.println("You are Working Professional");
	   
   } 
   else
   { System.out.println("You are Retired");
   }
   
	}
}
