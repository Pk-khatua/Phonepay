package com.antra.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Program3 {
	private static void cnkfrq(List<Integer> lst) {
		Map<Integer,Integer> mp=new HashMap<>();
		for(Integer i:lst) {
			if(mp.containsKey(i)) {
				mp.put(i,mp.get(i)+1);
			}
			else {
				mp.put(i,1);
			}
		}
		System.out.println(mp);
	}
	public static void main(String[] args) {
		List<Integer> lst=new ArrayList<>(Arrays.asList(1,2,5,8,1,5,6,9,3,1));
		Program3.cnkfrq(lst);
	}

}
