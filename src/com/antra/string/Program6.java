package com.antra.string;

public class Program6 {
	private static void lwrcs(String s) {
		String s1="";
		for(int i=0;i<s.length();i++) {
			s1=s1+Character.toLowerCase(s.charAt(i));
		}
		System.out.println(s1);
	}
	public static void main(String[] args) {
		String s="MOM";
		Program6.lwrcs(s);
	}

}
