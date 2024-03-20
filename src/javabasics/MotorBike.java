package javabasics;

public abstract class MotorBike {

	abstract void brake();
}

class SportsBike extends MotorBike{
	// implementation of abstract method
	public void brake() {
		System.out.println("Sports Bike Brake");
	}
}

class MountainBike extends MotorBike{
	public void brake() {
		System.out.println("Mountainbike brake");
	}
}

