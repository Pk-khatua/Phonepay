package com.antra.practice;

public class Rpt_str {
	private static void chkfrq(String [] s) {
		String str="";
		int max=0;
		for(int i=0;i<s.length;i++) {
			int temp=1;
			for(int j=i+1;j<s.length;j++) {
				if(s[i].equals(s[j])) {
					temp++;
				}
			}
			if(temp>max) {
				str=s[i];
				max=temp;
			}
		}
		System.out.println(str+"="+max);
	}
	public static void main(String[] args) {
		String [] arr={"Apples", "Apples" , "Oranges", "Watermelon", "Apples"};
		Rpt_str.chkfrq(arr);
	}

}
