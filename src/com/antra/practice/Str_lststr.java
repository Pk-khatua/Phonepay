package com.antra.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class StrUtilCls{
	public List<String> lsStr(String str){
//		String [] x=str.split(" ");
		List<String> l=new ArrayList<>();
		l=Arrays.asList(str.split(" "));
//		for(int i=0;i<x.length;i++) {
//			l.add(x[i]);
//		}
		return l;	
	}
}
public class Str_lststr {
	public static void main(String[] args) {
		String s="hello welcome to java";
		StrUtilCls suc=new StrUtilCls();
		System.out.println(suc.lsStr(s));
	}
}
