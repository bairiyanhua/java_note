package com;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("1.��¼ϵͳ");
		System.out.println("2.�˳�");
		System.out.print("��ѡ��");
		int choose = input.nextInt();
		switch(choose){
		case 1:
			System.out.println("1.�ͻ���Ϣ����");
			System.out.println("2.�������");
			System.out.println("3.�������");
			System.out.println("4.ע��");
			System.out.print("��ѡ��");
			int choose2 = input.nextInt();
			switch (choose2) {
			case 1:
				System.out.println("===�ͻ���Ϣ����===");
				System.out.println("1.��ʾ���пͻ���Ϣ");
				System.out.println("2.��ӿͻ�");
				System.out.println("3.�޸Ŀͻ�");
				System.out.println("4.���ҿͻ�");
				break;
			case 2:
				System.out.println("===�������===");
				break;
			case 3:
				System.out.println("===�������===");
				System.out.println("1.���˴����");
				System.out.println("2.���˳齱");
				System.out.println("3.�����ʺ�");
				break;
			case 4:
				System.out.println("===ע��===");
				break;
			}
			break;
		case 2:
			System.out.println("ллʹ�ã�");
			break;
		}
		
		
		
	}

}
