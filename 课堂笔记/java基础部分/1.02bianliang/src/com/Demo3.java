package com;

import java.util.Scanner;

public class Demo3 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("�������û�����");
		//next()������ȡ��������ַ���
//		String name = "����";
		String name = input.next();
		
		System.out.print("���������䣺");
		int age = input.nextInt();
//		double height = input.nextDouble();
		
		System.out.println(name + "===" + age);
		
		
	}
	
	

}
