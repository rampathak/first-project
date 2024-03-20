package javabasics;

public class RegEncapImp {
	
	public static void main(String[] args) {
		
		RegisterEncap registerencap = new RegisterEncap();
		registerencap.setid(7);
		System.out.println(registerencap.getid());
		registerencap.setpwd("Password");
		System.out.println(registerencap.getpwd());
		
		
	}
	
	
	
	
}
