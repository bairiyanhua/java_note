package com.kgc.exam;

import java.util.Scanner;

public class leitai {
	public static void main(String[] args) {
		// �������ͬѧ�Ŀ��Գɼ���ȡ����߷����
		double[] scores = new double[5];
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < scores.length; i++) {
			System.out.println("�������" + (i + 1) + "��ͬѧ�ĳɼ�:");
			scores[i] = input.nextDouble();

		}
		// ��ȡ�ɼ��е���÷� max--->��̨
		double max = scores[0];
		for (int i = 1; i < scores.length; i++) {
			if (scores[i] > max) {
				max = scores[i];
			}
		}
		System.out.println("��߷��ǣ�" + max);
	}

}
