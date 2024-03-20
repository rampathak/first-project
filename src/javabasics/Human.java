package javabasics;

public abstract class Human {
	
	String name;
	public Human (String name) {  //constructor
		this.name=name;
	}
		public Human() {
			
		}
		
	
	
	public void eat() {
		System.out.println("The human eats someting"); // concrete method
	}
	
	public abstract void walk();// abstract method without implementation
	public abstract void learn();// abstract method without implementation

}
