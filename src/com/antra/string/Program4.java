package com.antra.string;

public class Program4 {
	private static void isanagrm(String s1,String s2) {
		boolean flag=false;
		for(int i=0;i<s1.length();i++) {
			for(int j=0;j<s2.length();j++) {
				if(s1.charAt(i)==s2.charAt(j)) {
					flag=true;
				}
				else {
					flag=false;
				}
			}
		}
		System.out.println(flag);
	}
	public static void main(String[] args) {
		String s1="mom";
		String s2="omm";
		Program4.isanagrm(s1,s2);
	}

}
