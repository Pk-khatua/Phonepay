package com.antra.string;

import java.util.Arrays;

public class Program12 {
	private static void cnvtchar_arry(String s) {
		char [] ch=s.toCharArray();
		System.out.println(Arrays.toString(ch));
	}
	public static void main(String[] args) {
		String s="Pankaj";
		Program12.cnvtchar_arry(s);
	}

}
