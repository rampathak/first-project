package javabasics;

import java.util.ArrayList;

public class AddRemove {
	public static void main(String[] args) {
		
	
	ArrayList<String> list = new ArrayList<>();
	list.add("Ram");
	list.add("Madhu");
	list.add("Nur");
	list.add("Krishna");
	list.add("Sita");
	list.add("Sita");

	System.out.println(list);
	if(list.contains("Sita")) {
		list.remove("Ram");
	}else {
		list.add("Sita");
	}
	System.out.println(list);
	
	for(String str : list) {
		System.out.println(str);
	}


}
