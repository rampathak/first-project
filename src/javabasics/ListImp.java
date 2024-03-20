package javabasics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListImp {

	public static void main(String[] args) {
		[12:19 PM] Aaron  Sub
		int [] nums = {3, 8, 5, 10}; // array
				
				int [] nums2 = new int[5];
				nums2[0] = 5;
				nums2[1] = 4;
				
				
				//ArrayList<String> arrayList = new ArrayList<String>();// 1. option
				List<String> arrayList = new ArrayList<String>(); //2. option
				arrayList.add("Madhu");
				arrayList.add("Ram");
				arrayList.add("Nur");
				System.out.println(arrayList);
				/*for(int i =0; i<arrayList.size(); i++) {
					System.out.println(arrayList.get(i));
				} */
				for(String str : arrayList ) {
					System.out.println(str);
				}
				System.out.println("*********************************");
				arrayList.add(1, "Kishwor");
				for(String str2 : arrayList) {
					System.out.println(str2);
				}
				
				System.out.println("********************************");
				//arrayList.clear();
				System.out.println(arrayList);
				
				System.out.println("********************************");
				boolean isFlag = arrayList.contains("Madhu");
				System.out.println(isFlag);
				
				System.out.println("********************************");
				boolean isFlag1 = arrayList.equals("Madhu");
				System.out.println(isFlag1);
				
				System.out.println("********************************");
				System.out.println(arrayList.indexOf("Nur"));
				
				System.out.println("********************************");
				System.out.println(arrayList.remove(0));
				
				System.out.println(arrayList.set(0, "Peter"));
				
				System.out.println(arrayList.size());
				
				List<String> arrayList2 = new LinkedList<String>();//linked list
				
				List<String> arrayList3 = new Vector<String>();//vector list
	}
}
