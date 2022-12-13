package com.antra.Map;


import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Program10 {
	private static void sortmap(Map<String,Integer> mp) {
		List<Map.Entry<String,Integer>> hm=new LinkedList<Map.Entry<String,Integer>>(mp.entrySet());
		Collections.sort(hm,(i1,i2)->i2.getValue().compareTo(i1.getValue()));
		Map<String,Integer> temp=new LinkedHashMap<String,Integer>();
		for(Map.Entry<String,Integer> lst:hm) {
			temp.put(lst.getKey(),lst.getValue());
		}
		System.out.println(temp);	
	}
	public static void main(String[] args) {
		Map<String,Integer> mp=new HashMap<>();
		mp.put("A",3);
		mp.put("B",2);
		mp.put("C",5);
		mp.put("D",8);
		mp.put("F",1);
		Program10.sortmap(mp);
	}

}
