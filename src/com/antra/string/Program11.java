package com.antra.string;

public class Program11 {
	private static void chkindx(String s) {
		char c='k';
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==c) {
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		String s="pankaj";
		Program11.chkindx(s);
	}

}
