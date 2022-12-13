package com.antra.List;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Program1 {
	private static void cnt_str(List<String> lst) {
		String[] str=new String[lst.size()];
		for(int i=0;i<lst.size();i++) {
			str[i]=lst.get(i).toUpperCase();
			}
//		System.out.println(Arrays.toString(str));
		Map<String,Integer> mp=new HashMap<>();
		for(String entry:str) {
			if(mp.containsKey(entry)) {
				mp.put(entry,mp.get(entry)+1);
			}
			else {
				mp.put(entry,1);
			}
		}
		System.out.println(mp);
	}
	public static void main(String[] args) {
		List<String> lst=Arrays.asList("Abc","Bcd","Def","abc","Ghi");
		Program1.cnt_str(lst);
	}

}
