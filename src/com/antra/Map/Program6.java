package com.antra.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Program6 {
	private static void rmvkey(Map<Integer,String> mp) {
		System.out.println(mp);
		int key=4;
		Iterator<Map.Entry<Integer,String>> iterator=mp.entrySet().iterator();
		while(iterator.hasNext()) {
			Map.Entry<Integer, String> entry=iterator.next();
			if(key==entry.getKey()) {
				iterator.remove();
			}
		}
		System.out.println("new map="+mp);
	}
	public static void main(String[] args) {
		Map<Integer,String> mp=new HashMap<>();
		mp.put(1,"A");
		mp.put(2,"B");
		mp.put(10,"C");
		mp.put(4,"D");
		mp.put(5,"F");
		Program6.rmvkey(mp);
	}

}
