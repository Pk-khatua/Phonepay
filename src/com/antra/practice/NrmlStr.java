package com.antra.practice;

import java.util.Arrays;
import java.util.List;

public class NrmlStr {
	public static void main(String[] args) {
		List<String> lst=Arrays.asList("ramakoti","mamidi","hello");
		String s="";
		for(int i=0;i<lst.size();i++) {
			s=s+" "+lst.get(i);
		}
		System.out.println(s);
	}

}
