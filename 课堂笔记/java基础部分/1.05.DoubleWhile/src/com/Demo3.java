package com;

import java.util.Scanner;

public class Demo3 {
	public static void main(String[] args) {
		/*
		 * ��4���༶��ÿ���༶��5��ѧ��
		 * ͳ��ÿ����ѧ�����ܳɼ���ƽ����
		 */
		Scanner input = new Scanner(System.in);
		
//		double sum = 0;
		for (int i = 1; i <= 4; i++) {
			System.out.println("�����"+i+"���༶�ĳɼ���");
			
			double sum = 0;
			for (int j = 1; j <= 5; j++) {
				System.out.print("�����"+j+"��ѧ���ĳɼ���");
//				double score = input.nextDouble();
//				sum = sum + score;
				sum += input.nextDouble();
			}
			System.out.println("��ǰ�༶���ܳɼ��ǣ�"+sum+",ƽ�����ǣ�"+(sum/5));
			System.out.println();
		}
		
		
	}

}
