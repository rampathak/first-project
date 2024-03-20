package javabasics;

public class Boy extends Human {

	public Boy(String name) {  //constructor
		super(name);   // 
		
		System.out.println("This is constructors with paramets");
		
		// TODO Auto-generated constructor stub
	}
	
	public Boy() {  //constructor
		  // 
		
		System.out.println("This is constructors without paramets");
		
		// TODO Auto-generated constructor stub
	}

	public void walk() {
		
		System.out.println("The boy walks");
		// TODO Auto-generated method stub
		
	}

	public void learn() {
		System.out.println("The boy learns");
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		Boy boy =new Boy("ram");
		System.out.println(boy.name);
		boy.walk();
		boy.learn();
		boy.eat();
	}

	

}
