package com.antra.practice;

import java.util.Arrays;

public class SmalhlNum {
	public static void main(String[] args) {
		int [] arr=  {9,-4, -1,2, -3 };
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
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0 && arr != null) {
				System.out.println(arr[i]);
				break;
			}
		}
	}

}
