package com;

import java.util.Scanner;

public class If {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("������С����java�ɼ���");
		int javaScore = input.nextInt();
		
		System.out.print("������С�������ֳɼ���");
		int musicScore = input.nextInt();
		
		if((javaScore>90 && musicScore>80) || (javaScore==100 && musicScore>70)){
			System.out.println("������");
		}
		
		
		
		
	}
	

}
