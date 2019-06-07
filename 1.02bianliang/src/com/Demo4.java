package com;

public class Demo4 {

	public static void main(String[] args) {
		
		//自动类型转换：小转大
		//byte short int long 
		byte aa = 10;
		short bb = aa;
		
		//强制类型转换：大转小
		//可能会出现数据丢失
		short cc = 200;
		byte dd = (byte)cc;
		System.out.println(dd);
		
		
		
		
	}
}
