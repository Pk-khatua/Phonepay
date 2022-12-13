package com.antra.practice;

import java.util.HashMap;
import java.util.Map;

public class RmvDplct {
	public static void main(String[] args) {
		char[] ch= {'a','b','a','c','d','a','d'};
		Map<Character,Integer> hm=new HashMap<>();
		int temp=0;
		for(int i=0;i<ch.length;i++) {
			temp++;
			hm.put(ch[i],temp);
			temp=0;
		}
		System.out.println(hm.keySet());
	}

}
