package com.antra.string;

public class Program9 {
	private static void check(String s,String s1) {
		boolean x= s==s1;
		boolean y= s.equals(s1);
		System.out.println(x);
		System.out.println(y);
	}
	public static void main(String[] args) {
		String s="pankaj";
		String s1="pankaj";
		Program9.check(s, s1);
	}

}
