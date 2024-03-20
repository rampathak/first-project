package javabasics;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashMapping {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap <>();// unsychronized
		map.put(342, "Ram");
		map.put(753, "Nur");
		map.put(132, "Madhu");
		map.put(342, "Kishwor");
		System.out.println(map);
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			// System.out.println(entry.getKey());
			// System.out.println(entry.getValue());
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		boolean isFlag = map.containsKey(200);
		System.out.println(isFlag);
		System.out.println(map.get(132));
		System.out.println(map.keySet());
		map.replace(753, "Nur", "Krishna");
		System.out.println(map);
		System.out.println(map.size());
 
		Hashtable<String, String> hashTable = new Hashtable<String, String>();// synchronizes
		hashTable.put("Nu", "Nur Aalam");
		hashTable.put("Ma", "Madhu Adhi");
		hashTable.put("Ra", "Ram Pathak");
		System.out.println(hashTable);
		for (Map.Entry<String, String> entry : hashTable.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}

}
