package com.bdqn;

import java.util.Scanner;

public class ScoreAssess {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
        System.out.print("�����뿼�Գɼ�: "); //��ʾҪ���뿼�Գɼ�
        int score =  input.nextInt(); 	//�ӿ���̨��ȡ�ɼ�
	    if (score >= 80) { // ���Գɼ�>=80
			System.out.println("����");
		} else if (score >= 60) { // 80>���Գɼ�>=60
			System.out.println("�е�");
		} else { // ���Գɼ�<60
			System.out.println("��");
		}
	}
}
