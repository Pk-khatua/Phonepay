package com.antra.string;

public class Program2 {
	private static void cmpr(String s,String s1) {
		Boolean flag=false;
		if(s.equals(s1)) {
			flag=true;
		}
		else {
			flag=false;
		}
		System.out.println(flag);
	}
	public static void main(String[] args) {
		String s="examp";
		String s1="example";
		Program2.cmpr(s, s1);
	}

}
