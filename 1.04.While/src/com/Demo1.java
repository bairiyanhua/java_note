package com;

import java.util.Scanner;

public class Demo1 {
	
	public static void main(String[] args) {
		
		/*int i = 1;
		while(i <= 50){
			System.out.println("打印第"+i+"份试卷");
		}*/
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("检查是否合格：(y/n): ");
		String result = input.next();
		while("n".equals(result)){
			System.out.println("上午阅读理解");
			System.out.println("下午上机练习");
			
			System.out.println("检查是否合格：(y/n): ");
			result = input.next();
		}
		System.out.println("终于合格了。。。");
		
		
	}

}
