package javabasics;
/* For loop
 * The for loop is perhaps the most commonly used loop in Java. It’s perfect for situations 
 * where you know exactly how many times you want to loop through a block of code
 */
public class MyLoop {
	
	public static void main(String[] args) {
		//for loop
		//program that print  0 to 4 using for loop
		System.out.println("Output from for loop");
		for(int i=0;i<5;i++)
		{
			System.out.println(i);
		}
		
		/* The while loop in Java is used when you want to repeat a part of your program several times, 
		 * but you do not know in advance how many times the repetition should occur.
		 * while(condition){
    // code to be executed
}
		 */
		System.out.println("Output from while loop");
		
		int i = 0;
		while(i < 20) {
		    System.out.println(i);
		    i++;
		}
		
		/* The do-while loop is similar to the while loop, but with a key difference: 
		 * the do-while loop will execute the block of code once before checking the condition, 
		 * then it will repeat the loop as long as the condition is true.
		 * 
		do{
		    // code to be executed
		}
		while(condition
		 */
		System.out.println("Output from do while loop");
		
		int j = 20;
		do {
		    System.out.println(j);
		    j--;
		}
		while(j > 1);
		
		
	}

}

