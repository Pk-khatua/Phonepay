package com.antra.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Program7 {
	private static void rmvalu(Map<Integer,String> mp) {
		System.out.println(mp);
		String value="C";
		Iterator<Map.Entry<Integer,String>> iterator=mp.entrySet().iterator();
		while(iterator.hasNext()) {
			Map.Entry<Integer,String> entry=iterator.next();
			if(value.equals(entry.getValue())) {
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
		Program7.rmvalu(mp);
	}

}
