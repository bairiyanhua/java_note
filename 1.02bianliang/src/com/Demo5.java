package com;

public class Demo5 {
	public static void main(String[] args) {
		int a = 10;
		int b = 3;
		
		int c = a + b;
		System.out.println(c);
		
		int d = a - b;
		System.out.println(d);
		
		int e = a * b;
		System.out.println(e);
		
		//只取商
		double f = a / b;
		System.out.println(f);
		
		//取余数
		int g = a % b;
		System.out.println(g);
		
//------------------------------------------------------------------------		
		
		int h = 100;
		int i = 100;
		System.out.println(h++);
		System.out.println(++i);
		
		int x = 10;
		int y;
		y = (++x)+(x++);
		System.out.println(y);
		
		
		
	}

}
