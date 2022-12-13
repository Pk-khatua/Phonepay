package com.antra.Map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Program2 {
	private static void lrgkv(Map<Integer,String> mp) {
		Integer i=Collections.max(mp.keySet());
		for(Map.Entry<Integer,String> entry:mp.entrySet()) {
			if(i==entry.getKey()) {
				System.out.println(entry.getValue());
				break;
			}
		}
	}
	public static void main(String[] args) {
		Map<Integer,String> mp=new HashMap<>();
		mp.put(1,"A");
		mp.put(2,"B");
		mp.put(10,"C");
		mp.put(4,"D");
		mp.put(5,"F");
		Program2.lrgkv(mp);
	}

}
