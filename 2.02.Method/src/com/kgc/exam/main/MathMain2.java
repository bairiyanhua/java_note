package com.kgc.exam.main;

import java.util.Scanner;

import com.kgc.exam.User;
import com.kgc.exam.MathDemo;

public class MathMain2 {
	
	public static void main(String[] args) {
		/*
		 * �ֶ��������ſεĳɼ�
		 * ����ֺܷ�ƽ����
		 */
		Scanner input = new Scanner(System.in);
		MathDemo math = new MathDemo();
		
		System.out.print("������java�ɼ���");
		double java = input.nextDouble();
		
		System.out.print("������c#�ɼ���");
		double c = input.nextDouble();
		
		System.out.print("������db�ɼ���");
		double db = input.nextDouble();
		
		User aaa = new User();
		//�����вη�����Ҫ�Ѷ�Ӧ�Ĳ�������ȥ
		double sum = math.sum(java, c, db);
		
		System.out.println("�ܷ��ǣ�" + sum);
		
		
		
	}

}
