package com.antra.Map;

import java.util.HashMap;
import java.util.Map;

public class Program4 {
    
	private  static void itrt(Map<Integer,String> mp) {
		for(Map.Entry<Integer,String> entry:mp.entrySet()) {
			System.out.print("key="+entry.getKey());
			System.out.println("value="+entry.getValue());
		}
	}
	public static void main(String[] args) {
		Map<Integer,String> mp=new HashMap<>();
		mp.put(1,"A");
		mp.put(2,"B");
		mp.put(10,"C");
		mp.put(4,"D");
		mp.put(5,"F");
		Program4.itrt(mp);
		
	}

}
