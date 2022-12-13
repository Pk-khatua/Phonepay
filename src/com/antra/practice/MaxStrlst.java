package com.antra.practice;

import java.util.Arrays;
import java.util.List;

public class MaxStrlst {
	private void countmax(List<String> al) {
		int max=0;
		String str="";
		for(int i=0;i<al.size();i++) {
			int temp=1;
			for(int j=i+1;j<al.size();j++) {
				if(al.get(i).equals(al.get(j))) {
					temp++;
				}
			}
			if(temp>=max) {
				str=al.get(i);
				max=temp;
			}
		}
		System.out.println(str+"="+max);
	}
	public static void main(String[] args) {
		List<String> al=Arrays.asList("A","BCD","BCD","DEF","BCD","DEF");
		MaxStrlst ms=new MaxStrlst();
		ms.countmax(al);
	}
}
