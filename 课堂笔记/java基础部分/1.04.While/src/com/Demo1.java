package com;

import java.util.Scanner;

public class Demo1 {
	
	public static void main(String[] args) {
		
		/*int i = 1;
		while(i <= 50){
			System.out.println("��ӡ��"+i+"���Ծ�");
		}*/
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("����Ƿ�ϸ�(y/n): ");
		String result = input.next();
		while("n".equals(result)){
			System.out.println("�����Ķ����");
			System.out.println("�����ϻ���ϰ");
			
			System.out.println("����Ƿ�ϸ�(y/n): ");
			result = input.next();
		}
		System.out.println("���ںϸ��ˡ�����");
		
		
	}

}
