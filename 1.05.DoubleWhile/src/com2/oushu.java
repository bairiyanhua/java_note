package com2;

// 100���ڵ�ż��֮�͵�����д��
public class oushu {
	public static void main(String[] args) {
		// ��һ��
		// int i=0;
		// int sum=0;
		// while(i<=100){
		// sum+=i;
		// i+=2;
		// }
		// System.out.println(sum);
		//

		// �ڶ���
		// int i=0;
		// int sum=0;
		// do{
		// sum+=i;i+=2;
		// }while(i<=100);
		// System.out.println(sum);
		//
		//
		// ������
		// int sum=0;
		// for(int i=0;i<=100;i+=2){
		// sum+=i;
		// }
		// System.out.println(sum);

		// ������
		int sum = 0;
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}

		System.out.println(sum);

	}
}
