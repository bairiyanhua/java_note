package com;

import java.util.Scanner;

public class Demo5 {
	public static void main(String[] args) {
		/*
		 * ѭ���Ӽ����������֣�����0ʱ����ѭ��
		 * �ҳ������������������ֵ����Сֵ
		 */
		Scanner input = new Scanner(System.in);
		int num;
		int max = 0;
		int min = 0;
		System.out.print("����������,����0������");
		max = min = num = input.nextInt();
		while(num != 0){
			System.out.print("����������,����0������");
			num = input.nextInt();
			if(num > max){
				max = num;
			}
			if(num < min && num != 0){
				min = num;
			}
		}
		System.out.println("���ֵ��:"+max+"����Сֵ��:"+min);
		
		
		
	}

}
