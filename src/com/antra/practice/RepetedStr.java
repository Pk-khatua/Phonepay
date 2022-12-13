package com.antra.practice;

import java.util.ArrayList;
import java.util.List;

public class RepetedStr {
	public static void main(String[] args) {
		List<String> l=new ArrayList<>();
		l.add("AA");
		l.add("AA");
		l.add("AB");
		l.add("AC");
		l.add("AC");
		String input="AA";
		int temp=0;
		for(int i=0;i<l.size();i++) {
			if(l.get(i).equals(input)) {
				temp++;
			}
		}
		System.out.println(input+"="+temp);
	}

}
