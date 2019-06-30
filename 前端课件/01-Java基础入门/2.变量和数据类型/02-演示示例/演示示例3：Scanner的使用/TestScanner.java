package test;

import java.util.Scanner;

public class TestScanner {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("请输入您的姓名：");
		String name=input.next();
		System.out.print("请输入您的号码：");
		int num=input.nextInt();
		
		System.out.println(name+"您好！您的等待号码为："+num);
		
	}
}
