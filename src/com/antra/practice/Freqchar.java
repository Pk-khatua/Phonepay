package com.antra.practice;

public class Freqchar {
	private static void chkfrq(String s) {
		String x=s.toUpperCase();
		int max=0;
		char c=' ';
		for(int i=0;i<x.length();i++) {
			int temp=1;
			for(int j=i+1;j<x.length();j++) {
				if(x.charAt(i)==x.charAt(j)) {
					temp++;
				}
			}
			if(temp>max) {
				c=x.charAt(i);
				max=temp;
			}
		}
		System.out.println(c+"="+max);
		System.out.println("frequency of the latter is "+c);
	}
	public static void main(String[] args) {
		String Input = "MISSISSIPPI";
		Freqchar.chkfrq(Input);
	}

}
