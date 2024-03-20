
/*Firstly, you would need to know about inheritance in order to understand about method overriding. So , assuming that you are familiar with the concepts of inheritance and you know what is a parent and a child class , lets try to understand what method overriding is.

Suppose you have a parent class Bank which has a method: getInterest()

Now different Banks would have different rates of interest. Let us assume we have 3 banks:
1. State Bank of India
2. Punjab National Bank
3. Bank of India

These can be treated as the child classes or subclasses

Now, all these banks would charge or have different rates of interest depnding on their policies.

Initially we had defined a method inside our bank class which calculated the rate of interest which was getInterest().

Now suppose we want all of our subclasses to have the same method name , i.e getInterest() but with different implementation , like for the State Bank it could be 7 % for Punjab National Bank it could be 8% etc.

So we override our original method in our subclasses by defining the method by the same name but changing its implementation(or what it would do), like for SBI it would print an interest rate of 7 % and for PNB it would print an interest rate of 8% whenever it s called.

So, this is what basically method overriding does. It allows a subclass or child class to provide a specific implementation of a method that is already provided by one of its superclasses or parent classes."
package javabasics; */
package javabasics;
public class MethodOverriding {
	public static void main(String[] args) {
		Father father =new Father();
		father.intrest();
		Father father1 =new Son();
		father1.intrest();
	}

}
