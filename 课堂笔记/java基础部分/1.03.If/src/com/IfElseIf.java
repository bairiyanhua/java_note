package com;

import java.util.Scanner;

public class IfElseIf {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("������С���ĳɼ���");
		int score = input.nextInt();
		
		//>=90 ����  >=80���� >=70�պ� <70������
		/*if(score>=90){
			System.out.println("����");
		}
		if(score<90 && score>=80){
			System.out.println("����");
		}
		if(score<80 && score>=70){
			System.out.println("�պ�");
		}
		if(score<70){
			System.out.println("������");
		}*/
		
		if(score >= 90){
			System.out.println("����");
		}else if(score >= 80){
			System.out.println("����");
		}else if(score >= 70){
			System.out.println("�պ�");
		}else{
			System.out.println("������");
		}
		
		
		
		
		
	}

}
