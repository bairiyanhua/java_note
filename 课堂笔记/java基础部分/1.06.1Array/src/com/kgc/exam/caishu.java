package com.kgc.exam;

import java.util.Scanner;
//����

public class caishu {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int nums[] = { 31, 44, 56, 7, 23, 3 };
		// ��ʶ����¼�û��Ƿ�¶������� true�¶��ˣ�false�´���
		boolean flag = false;
		int guess = input.nextInt();
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == guess) {
				// �¶��ˣ�forѭ���Ͳ���������
				flag = true;
				break;
			}

		}
		if (flag) {
			System.out.println("��ϲ���¶��ˣ�");
		} else {
			System.out.println("�Բ���û���У�");
		}

	}

}