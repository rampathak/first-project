package javabasics;

public class StringImp {
	
	public static void main(String[] args) {
		/*String name = "Kishwor"; //literal
		String name1= "Kishwor";
		String name2 = "Kishwor";
		String name6 = "Nur";
		String name3 = new String("Ram"); // with new keyword
		String name4 = new String("Ram");
		String name5 = new String("Ram");
		System.out.println(name==name1);
		System.out.println(name3==name4);
		name = "Madhu";

	}
	*/
	
//	//reverse
//			String name = "Madhu";
//			
//			//1. alternative reverse
//			for(int i =name.length()-1; i>=0; i--) {
//				System.out.print(name.charAt(i));
//			}
		
		
		String name="Madhu";
				for(int i=name.length()-1;i>=0; i--) {
					System.out.print(name.charAt(i));
				}
				
				
				
				
				//Next way
				System.out.println("--------------------------------");
				StringBuffer str = new StringBuffer(name);
				System.out.println(str.reverse());
				
				//convert int to string
				
//			//2. alternative reverse
//			System.out.println("-----------------");
//			StringBuffer str = new StringBuffer(name);
//			System.out.println(str.reverse());
//			
//			// convert int to string
//			int num = 56721;
//			String strConvert = String.valueOf(num);
//			StringBuilder strbuilder = new StringBuilder(strConvert);
//			System.out.println(strbuilder.reverse());
//			
//			//convert String to int
//			String num1 = "6854";
//			Integer num2 = Integer.valueOf(num1);   // parseInt can also be used like 	Integer num2 = Integer.parseInt(num1); 
				
//			System.out.println(num2);

				String num1="2345";
				Integer num2=Integer.valueOf(num1);
				System.out.println(num2);
				
				
//			//print out the character count of string value without space
//			String myName = " This is my name ";
//			int count = 0;
//			System.out.println("With space - " +myName.length());
//			for(int i =0; i< myName.length(); i++) {
//				if(myName.charAt(i)!= ' ') {
//					count++;
//				}
//			}
//			System.out.println("Without space - " +count);
//			
//			//palindrome
//			String replace = "4sgse@shd$";
//			String isBlank = " ";
//			String teacher1 = "Madam";
//			String teacher2 = "";
//			for(int i = teacher1.length()-1; i>=0; i--) {
//				teacher2 = teacher2 + teacher1.charAt(i);
//			}
//			System.out.println(teacher2);
//			if(teacher1.equalsIgnoreCase(teacher2)) {
//				System.out.println("Palindrome");
//			}else {
//				System.out.println("No palindrome");
//			}
//			
//			System.out.println(teacher1.contains("am"));
//			System.out.println(teacher1.endsWith("a"));
//			System.out.println(teacher1.indexOf("d"));
//			System.out.println(isBlank.isBlank());
//			System.out.println(isBlank.isEmpty());
//			System.out.println(teacher1.replace("d", "c"));
//			System.out.println(replace.replaceAll("[^0-9a-zA-Z]",""));
//
	}
//	
//
}
