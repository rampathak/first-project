package javabasics;

public class EncapsulationImp {
	
	public static void main(String [] args) {
	
	EncapsulationExp encapsulationExp =new EncapsulationExp();
	encapsulationExp.setNum(6);
	System.out.println(encapsulationExp.getNum());
	encapsulationExp.setName("Krishna");
	System.out.println(encapsulationExp.getName());
	
	}
}
