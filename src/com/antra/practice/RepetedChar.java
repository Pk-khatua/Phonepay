package com.antra.practice;

import java.util.HashMap;
import java.util.Map;

public class RepetedChar {
	public static void main(String[] args) {
		String s="aaabacbbdccccd";
		int[]temp=new int[s.length()];
		char[] str=s.toCharArray();
		Map<Character,Integer> hm=new HashMap<Character,Integer>();
		for(int i=0;i<s.length();i++) {
			temp[i]=1;
			for(int j=i+1;j<s.length();j++) {
				if(str[i]==str[j]) {
					temp[i]++;
					str[j]='o';
				}	
			}
		}
		for(int i=0;i<temp.length;i++) {
			if(str[i] !=' ' && str[i] !='o') {
//				System.out.println(str[i]+"="+temp[i]);
				hm.put(str[i],temp[i]);	
			}
		}
//		System.out.println(hm);
		Map.Entry<Character,Integer> x=null;
		for(Map.Entry<Character, Integer> w:hm.entrySet()) {
			if(x == null || w.getValue()>x.getValue()) {
				x=w;
			}
		}
		System.out.println(x);
	}
}
