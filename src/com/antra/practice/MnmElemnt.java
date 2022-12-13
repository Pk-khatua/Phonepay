package com.antra.practice;

public class MnmElemnt {
	public static void main(String[] args) {
		int[] arr= {2,78,1,5,18};
		int x=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					x=arr[j];
					arr[j]=arr[i];
					arr[i]=x;
				}
			}
		}
		System.out.println(arr[0]);
	}

}
