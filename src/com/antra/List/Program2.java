package com.antra.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Program2 {
	private static void ferq(List<String> lst) {
		Map<String,Integer> mp=new HashMap<>();
		for(String s:lst) {
			if(mp.containsKey(s)) {
				mp.put(s,mp.get(s)+1);
			}
			else{
				mp.put(s,1);
			}
		}
		System.out.println(mp);
	}
	public static void main(String[] args) {
		List<String> lst=new ArrayList<>(Arrays.asList("AAA","BBB","AAA","AA","BB","CCC","BBB"));
		Program2.ferq(lst);
	}

}
