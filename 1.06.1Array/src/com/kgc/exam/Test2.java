package com.kgc.exam;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] num = {8,4,2,1,23,344,12};
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
			sum += num[i];
		}
		System.out.println();
		System.out.println("���ǣ�"+sum);
		
		System.out.print("����һ������");
		int aa = input.nextInt();
		
		boolean isIn = false; //�жϴ治���ڣ�Ĭ�ϲ�����
		for (int i = 0; i < num.length; i++) {
			if(num[i] == aa){
				isIn = true;
				break;
			}
		}
		
		if(isIn){
			System.out.println("����");
		}else{
			System.out.println("������");
		}
		
	}

}
