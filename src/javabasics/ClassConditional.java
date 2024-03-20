package javabasics;

public class ClassConditional {
	
	public static void main(String[] args) {
		int userId = 65342;
		 
	if (userId == 65343) { // compare -- condition true --nested -->outer conditional statement
	if(userId > 60000) { // inner conditional statement.
	System.out.println("1. The user is able to log in to the page");
	}
	else {
	System.out.println("2. The user is not able to log in");	      
	}
	   }
	else if(userId <10000){
	

	System.out.println("3. The user id is incorrect");
	}
	else{
	System.out.println("4. None of the codition matched");
	    }
	 
	  }

}

