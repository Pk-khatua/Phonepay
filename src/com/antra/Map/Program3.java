package com.antra.Map;

import java.util.HashMap;
import java.util.Map;

public class Program3 {
	private static void cloning(Map<Integer,String> mp) {
		System.out.println(mp);
	    Map<Integer,String> mp1=new HashMap<>();
	    for(Map.Entry<Integer,String> entry:mp.entrySet()) {
	    	mp1.put(entry.getKey(),entry.getValue());
	    }
	    System.out.println(mp1);
	}
	public static void main(String[] args) {
		Map<Integer,String> mp=new HashMap<>();
		mp.put(1,"A");
		mp.put(2,"B");
		mp.put(10,"C");
		mp.put(4,"D");
		mp.put(5,"F");
		Program3.cloning(mp);
	}

}
