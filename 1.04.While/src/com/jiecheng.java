package com;

import java.util.Scanner;

public class jiecheng {
	public static void main(String[] args) {
		// ����n! 1*2*3*4*.....*n
		Scanner input = new Scanner(System.in);
		System.out.println("������һ��������");
		int n = input.nextInt();

		int sum = 0;// ��¼�׳��ܺ�
		int result = 1;// �׳˵����ս��
		for (int i = 1; i <= n; i++) {
			result *= i;// result=result*i; 1*1(1!) 1*1*2(2!) 1*1*2*3��3����........
			sum += result;
		}
		System.out.println(n + "�Ľ׳��ǣ�" + result);
		System.out.println("1!+2!+3!+......"+n+"!=" + sum);

	}
}
