package javabasics;

import java.util.HashSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class SetImp {
	
	
	//Set<String> set = new HashSet<String>();
			HashSet<String> set = new HashSet<String>();
			set.add("Madhu");
			set.add("Nur");
			set.add("Ram");
			set.add("Nur");
			Iterator<String> it = set.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
			/*for(String str : set) {
				System.out.println(str);
			} */

}
