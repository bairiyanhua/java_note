package com;

public class Demo7 {
	public static void main(String[] args) {
		/*
		 * 跳出循环：
		 * 	1. break : 从整个循环当中跳出，不会再继续执行后面的循环
		 *  2. continue : 跳过本次循环，继续执行下一次循环
		 */
		for (int i = 1; i <= 10; i++) {
			if(i == 7){
				continue;
			}
			System.out.print(i + " ");
		}
		
		
		
	}

}
