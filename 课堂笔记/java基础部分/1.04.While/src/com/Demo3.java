package com;

import java.util.Scanner;

public class Demo3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String result;
		do{
			System.out.println("上午阅读理解");
			System.out.println("下午上机练习");
			System.out.println("合格了吗？");
			result = input.next();
			
		}while("n".equals(result));
		System.out.println("终于合格了。。。。");
		
		
	}

}
