package com.antra.string;

import java.util.Arrays;

public class Program3 {
	private static void isnumeric(String s) {
		String y="";
		char[] temp= {};
		for(int i=0;i<s.length();i++) {
			if(Character.isDigit(s.charAt(i))) {
				temp[i]=s.charAt(i);
			}
			else {
				y=y+s.charAt(i);
			}
		}
		System.out.println(y);
		System.out.println(Arrays.toString(temp));	
	}
	public static void main(String[] args) {
		String s="pokojoj";
		Program3.isnumeric(s);
	}

}
