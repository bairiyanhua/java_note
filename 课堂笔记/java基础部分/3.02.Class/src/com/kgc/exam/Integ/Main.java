package com.kgc.exam.Integ;

public class Main {

	public static void main(String[] args) {
		
		//把基本数据类型  转成  包装类
		Integer aa = new Integer(250);
		
		//把可解析的字符串  转成  包装类
		Integer bb = new Integer("250");
//		String dd = bb.toString();
//		String ee = '男' + "";
//		String dd = 250 + "";
//		String ff = true + "";
		
		
		//把包装类  转成  基本数据类型
		int cc = aa.intValue();
		
//		Boolean dd = new Boolean("true");
//		boolean ee = dd.booleanValue();
		
		
		int dd = Integer.parseInt("250");
		
		Integer ee = Integer.valueOf(250);
		Integer ff = Integer.valueOf("250");
		
		
		
		
		
		
		
	}
	
}
