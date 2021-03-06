package com.code.mahi;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
	public static void main(String[] args) {
		HashMap<Integer, String> map=new HashMap<>();
		map.put(1, "tommy");
		map.put(2, "lily");
		map.put(4, "rozi");
		map.put(3, "marry");
		map.put(3, "Sonam");
		map.put(9,"Mina");
		map.put(null,null);
		map.put(6, null);
		
		System.out.println(map);
		
		for(Map.Entry m:map.entrySet())
			System.out.println(m.getKey()+" "+m.getValue());
		
		Hashtable<Integer, String> table=new Hashtable<>();
		table.put(1, "tommy");
		table.put(2, "lily");
		table.put(4, "rozi");
		table.put(3, "marry");
		table.put(3, "Sonam");
		table.put(9,"Mina");
//		table.put(null,null);
//		table.put(6, null);
		
		System.out.println(table);
		
		for(Map.Entry m:table.entrySet())
			System.out.println(m.getKey()+" "+m.getValue());
		
		TreeMap<Integer, String> map1=new TreeMap<>();
		map1.put(1, "tommy");
		map1.put(2, "lily");
		map1.put(4, "rozi");
		map1.put(3, "marry");
		map1.put(3, "Sonam");
		map1.put(9,"Mina");
//		map1.put(null,null);
//		map1.put(6, null);
		
		System.out.println(map1);
		
		for(Map.Entry m:map1.entrySet())
			System.out.println(m.getKey()+" "+m.getValue());
	}
	

}
