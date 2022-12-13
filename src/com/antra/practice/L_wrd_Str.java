package com.antra.practice;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class L_wrd_Str {
	private static void chek_Length(String str) {
		Map<String,Integer> hm=new HashMap<>();
		StringTokenizer stk=new StringTokenizer(str);
		while(stk.hasMoreTokens()) {
			String z=stk.nextToken();
			hm.put(z,z.length());	
		}
		int max=Collections.max(hm.values());
		for(Map.Entry<String,Integer> smap:hm.entrySet()) {
			if(smap.getValue()==max) {
				System.out.println(smap.getKey());
			}
		}
	}
	public static void main(String[] args) {
		String input= "Hello Welocme to javaTraining";
		L_wrd_Str.chek_Length(input);
	}

}
