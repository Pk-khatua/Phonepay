package com.antra.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Program9 {
	private static void cnvtmap(List<String> lst) {
		System.out.println(lst);
		Map<String,Integer> mp=new HashMap<>();
		for(String s:lst) {
			if(mp.containsKey(s)) {
				mp.put(s,mp.get(s)+1);
			}
			else {
				mp.put(s,1);
			}
		}
		System.out.println("new map="+mp);
	}
	public static void main(String[] args) {
		List<String> lst=new ArrayList<>();
		lst.add("pankaj");
		lst.add("panda");
		lst.add("Pratush");
		lst.add("pankaj");
		lst.add("Sushanta");
		Program9.cnvtmap(lst);
	}

}
