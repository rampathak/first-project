package javabasics;

public class Deposit {
	int code = 4532; //instance variable
	static int phoneNumber = 57543365;  //static variable
	public static void main(String[] args) {
		
		Deposit deposit = new Deposit();// object creation
		
		Deposit deposit1 = new Deposit();
	    Deposit deposit2 = new Deposit();
	    System.out.println(phoneNumber);
	    System.out.println(deposit.code);//object is used to access the instance variable

	 System.out.println("After Change"); 
	deposit1.code = 6666;
	phoneNumber = 1111111;
	System.out.println("Instance value");
	System.out.println(deposit.code);//instance    
	System.out.println(deposit1.code);//instance
	System.out.println(deposit2.code);//instance
	System.out.println("Static value");
	System.out.println(deposit.phoneNumber);//static     
	System.out.println(deposit1.phoneNumber);//static
	System.out.println(deposit2.phoneNumber);//static
	    
	    
	    //every instance variable has its own copy of object --instance
	    //all instances have one copy of object
	    
	  }

		
	}  
