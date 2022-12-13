package com.antra.string;

public class Program13 {
	private static void ispalindrm(String s) {
		String s1=s.toUpperCase();
		String s2="";
		for(int i=0;i<s1.length();i++) {
			s2=s1.charAt(i)+s2;
		}
//		System.out.println(s2);
		if(s1.equals(s2)) {
			System.out.println("it is palindrom");
		}
		else {
			System.out.println("it is not palindrom");
		}
	}
	public static void main(String[] args) {
		String s="Mom";
		Program13.ispalindrm(s);
	}

}
