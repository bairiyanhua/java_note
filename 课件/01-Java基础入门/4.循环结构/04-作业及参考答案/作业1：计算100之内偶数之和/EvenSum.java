package com.bdqn;

public class EvenSum {

	/*
	 * ����100����ż��֮��
	 * ˼��������û��������ʽ��
	 */
	public static void main(String[] args) {
		//ʹ��while
		/*int sum = 0;	//��ǰ֮��
		int num = 2;	//����
		while(num <= 100){
			sum = sum + num;	//�ۼ�
			num = num + 2;
		}
		System.out.println("100���ڵ�ż��֮��Ϊ��" + sum);*/
		
		//ʹ��do-while
		/*int sum = 0;	//��ǰ֮��
		int num = 2;	//����
		do{
			sum = sum + num;	//�ۼ�
			num = num + 2;
		}while(num <= 100);
		System.out.println("100���ڵ�ż��֮��Ϊ��" + sum);*/
		
		//ʹ��for
		int sum = 0;	//��ǰ֮��
		for(int num=2;num<=100;num=num+2){
			sum = sum + num;	//�ۼ�
		}
		System.out.println("100���ڵ�ż��֮��Ϊ��" + sum);
	}
}
