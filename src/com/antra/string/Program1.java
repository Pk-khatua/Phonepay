package com.antra.string;

public class Program1 {
	private static void occurncChar(String s) {
		char x='a';
		int temp=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==x) {
				temp++;
			}
		}
		System.out.println(x+"="+temp);	
	}
	public static void main(String[] args) {
		String s="auxilarry";
		Program1.occurncChar(s);
	}

}
