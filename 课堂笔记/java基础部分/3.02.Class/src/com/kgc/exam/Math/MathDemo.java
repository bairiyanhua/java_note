package com.kgc.exam.Math;

import java.util.Random;

public class MathDemo {
	
	public static void main(String[] args) {
		
		//向上取整
		System.out.println(Math.ceil(2.01));
		
		//向下取整
		System.out.println(Math.floor(2.9999));
		
		//四舍五入
		System.out.println(Math.round(3.4));
		
		//随机数 0-1之间的数，包括0不包括1
		System.out.println(Math.random());
		
		//取1-9之间的随机整数
		System.out.println((int)(Math.random()*9)+1);
		System.out.println(Math.ceil(Math.random()*9));
		
		Random ran = new Random();
		System.out.println(ran.nextInt(9)+1);
		
		
		
	}
	
	

}
