package javabasics;

public interface Plant {
	public String name = "This is plant";
	public void grow();  //abstract keyword is optional
	public abstract void purifyair(); //interface should have abstract methods only
	public void takesCo2();
	

}
