package com.antra.practice;

public class StrPldrm {
	private static void checkpldrm(String s) {
		String x=s.toUpperCase();
		String z="";
		for(int i=0;i<x.length();i++) {
			z=x.charAt(i)+z;
		}
		if(x.equals(z)) {
			System.out.println("palindrom");
		}
		else {
			System.out.println("not palindrom");
		}
	}
	public static void main(String[] args) {
		String str="Mom";
		StrPldrm.checkpldrm(str);
	}
}
