package com.antra.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Program4 {
	private static void rmvdpcl(List<Integer> lst) {
		Set<Integer> st=new LinkedHashSet<>();
		for(Integer i:lst) {
			st.add(i);
		}
		System.out.println(st);
	}
	public static void main(String[] args) {
		List<Integer> lst=new ArrayList<>(Arrays.asList(1,2,5,8,2,1,3,4,6,9,3,7,1));
		Program4.rmvdpcl(lst);
	}

}
