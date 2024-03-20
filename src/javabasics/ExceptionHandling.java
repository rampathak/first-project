package javabasics;

public class ExceptionHandling {
	
	public static void main(String args [])
	{
	
	// Arithmetic exception
			try {
			int num = 5;
			int num2 = 0;
			System.out.println("Arithmetic Exception" +num/num2);
			
			}catch(ArithmeticException e) {
				e.printStackTrace();
				System.out.println("Exception occured.........");
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			
			System.out.println("-------------------");
			//NullPointerException
			String name = null;
			System.out.println(name.length());
			
			//NubmberFormatException
			/*String num = "6575e";
			int num1 = Integer.parseInt(num);
			System.out.println(num1);  */
			
			//ArrayIndexOutBoundException
			/*int [] num = {4, 6, 2};
			System.out.println(num[3]);   */
	}

}
