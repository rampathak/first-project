package javabasics;

public interface Polygon {
	
	/* An interface is a fully abstract class. It includes a group of abstract methods (methods without a body).
	 * We use the interface keyword to create an interface in Java. For example,

interface Language {
  public void getType();

  public void getVersion();
}
Here,

Language is an interface.
It includes abstract methods: getType() and getVersion().
Implementing an Interface
Like abstract classes, we cannot create objects of interfaces.

To use an interface, other classes must implement it. We use the implements keyword to implement an interface.
	 */
	
	
	void getArea(int length, int breadth);

}


// implements the polygon interface
class Rectangle implements Polygon{
	// implementation of abstract method
	public void getArea(int length, int breadth) {
	    System.out.println("The area of the rectangle is " + (length * breadth));
	  }
}


