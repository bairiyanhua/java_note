package com;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("������������");
		String name = input.next();
		
		System.out.print("������ɼ���");
		int score = input.nextInt();
		
		if(score <= 10){
			System.out.print("�������Ա�");
			String sex = input.next();
			
			if("��".equals(sex)){
				System.out.println("����������");
			}else if("Ů".equals(sex)){
				System.out.println("����Ů����");
			}
		}else{
			System.out.println("��Ǹ���ɼ�����꣬û������");
		}
		
		
		
	}

}
