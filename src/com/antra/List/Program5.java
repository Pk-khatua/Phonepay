package com.antra.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Program5 {
	private static void sumunq(List<Integer> lst) {
		Set<Integer> sm=new LinkedHashSet<>();
		Integer[] lst1= {};
		int x=0;
		for(Integer i:lst) {
			sm.add(i);
		}
		lst1=sm.toArray(new Integer[sm.size()]);
		System.out.println(Arrays.toString(lst1));
		for(int i=0;i<lst1.length;i++) {
			x=x+lst1[i];
		}
		System.out.println(x);
		
	}
	public static void main(String[] args) {
		List<Integer> lst=new ArrayList<>(Arrays.asList(1,2,5,8,2,1,3,4,6,9,3,7,1));
		Program5.sumunq(lst);
	}

}
