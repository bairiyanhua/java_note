package com;

import java.util.Scanner;

public class Demo4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("����ѧ��������");
		String name = input.next();
		double sum = 0;
		for (int i = 1; i <= 5; i++) {
			System.out.print("������5�Ź����еĵ�"+i+"�ſεĳɼ���");
//			double score = input.nextDouble();
//			sum = sum + score;
			sum += input.nextDouble();
		}
		System.out.println(name+"���ܷ��ǣ�"+sum + "��ƽ�����ǣ�"+(sum/5));
		
		
	}

}
