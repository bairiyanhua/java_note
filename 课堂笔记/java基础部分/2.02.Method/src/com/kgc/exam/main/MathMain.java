package com.kgc.exam.main;

import java.util.Scanner;

import com.kgc.exam.MathDemo;

public class MathMain {
	
	public static void main(String[] args) {
		/*
		 * �ֶ��������ſεĳɼ�
		 * ����ֺܷ�ƽ����
		 */
		Scanner input = new Scanner(System.in);
		MathDemo math = new MathDemo();
		
		System.out.print("������java�ɼ���");
		math.java = input.nextDouble();
		
		System.out.print("������c#�ɼ���");
		math.c = input.nextDouble();
		
		System.out.print("������db�ɼ���");
		math.db = input.nextDouble();
		
		double sum = math.sum();
		
		System.out.println("�ܷ��ǣ�" + sum);
		
		
		
	}

}
