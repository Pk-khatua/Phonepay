package com.antra.Map;

import java.util.HashMap;
import java.util.Map;

public class Program1 {
	private static void updtvlu(Map<String,Integer> hm) {
		System.out.println(hm);
		String x="C";
		int y=0;
		if(hm.containsKey(x)) {
			y=hm.get(x);
		}
		hm.put(x,(y+1));
		System.out.println(hm);
	}
	public static void main(String[] args) {
		Map<String,Integer> mp=new HashMap<>();
		mp.put("A",1);
		mp.put("B",2);
		mp.put("C",3);
		mp.put("D",4);
		mp.put("F",5);
		Program1.updtvlu(mp);
	}

}
