package com2;

import java.util.Scanner;

public class ForIf {
	public static void main(String[] args) {
		// ��������༶������¼����Ӧ�ɼ�������80��������Ա�ı���
		Scanner input = new Scanner(System.in);
		System.out.println("��¼��༶������");
		// �༶������
		double total = input.nextDouble();
		// ��¼�༶�д���80�ֵ�����
		int count = 0;
		for (int i = 1; i <= total; i++) {
			System.out.println("�������" + i + "���˵ĳɼ���");
			double score = input.nextDouble();
			if (score > 80) {
				count++;
			}
		}
		System.out.println("�༶�д���80�ֵ������ǣ�" + count);
		// double 5 3 3/5��0.6
		double rate = count / total * 100;
		System.out.println("�༶�д���80�ֵ���Ա����Ϊ��"+rate+"%");
	}

}
