package com.kgc.exam;

import java.util.Scanner;

public class Demo1 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try{
			System.out.print("请输入被除数：");
			int num1 = input.nextInt();
			
			System.out.print("请输入除数：");
			int num2 = input.nextInt();
		
			System.out.println("两数商为："+(num1/num2));
		} catch (NullPointerException e) {
			System.out.println("程序出现空指针");
		} catch (ArithmeticException e) {
			String str = e.getMessage();
			System.out.println("除数不能为0:"+str);
		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println("程序出现未知异常");
		}
		
		
		System.out.println("感谢使用！");
		
		
		
	}

}
