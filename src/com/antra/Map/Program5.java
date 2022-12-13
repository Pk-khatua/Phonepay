package com.antra.Map;

import java.util.HashMap;
import java.util.Map;

public class Program5 {
	private static void chakkey(Map<Integer,String> mp) {
		int key=5;
		for(Map.Entry<Integer,String> entry:mp.entrySet()) {
			if(key==entry.getKey()) {
				System.out.println("value="+entry.getValue());
				System.out.println("key="+entry.getKey());
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
		Program5.chakkey(mp);
	}

}
