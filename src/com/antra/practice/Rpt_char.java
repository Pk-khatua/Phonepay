package com.antra.practice;

public class Rpt_char {
	private static void chkfrq(String input) {
		int max=0;
		char ch=' ';
		for(int i=0;i<input.length();i++) {
			int temp=1;
			for(int j=i+1;j<input.length();j++) {
				if(input.charAt(i)==input.charAt(j)) {
					temp++;
				}
			}
			if(temp>max) {
				ch=input.charAt(i);
				max=temp;
			}
		}
		System.out.println(ch+"="+max);
	}
	public static void main(String[] args) {
		String input="Msissisipip";
		Rpt_char.chkfrq(input);
	}

}
