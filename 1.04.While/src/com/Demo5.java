package com;

import java.util.Scanner;

public class Demo5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("������һ��ֵ��");
		int num = input.nextInt();
		
		System.out.println("�������ֵ����������¼ӷ���");
		for (int i=0,j=num; i<=num; i++,j--) {
			System.out.println(i + " + " + j + " = " + (i+j));
		}
		
		
		
	}

}
