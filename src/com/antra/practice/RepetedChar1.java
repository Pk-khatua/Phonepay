package com.antra.practice;

public class RepetedChar1 {
	public static void main(String[] args) {
		String s="aaabacbbdccccd";
		int max=0;
		char x=' ';
//		int temp;
		for(int i=0;i<s.length();i++) {
		 int temp=1;
			for(int j=i+1;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					temp++;
				}
			}
			if(max < temp) {
				x=s.charAt(i);
				max=temp;
			}
		}
		System.out.println(x+"="+max);
	}

}
