package com.kgc.exam;

import java.util.Scanner;

public class Demo1 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try{
			System.out.print("�����뱻������");
			int num1 = input.nextInt();
			
			System.out.print("�����������");
			int num2 = input.nextInt();
		
			System.out.println("������Ϊ��"+(num1/num2));
		} catch (NullPointerException e) {
			System.out.println("������ֿ�ָ��");
		} catch (ArithmeticException e) {
			String str = e.getMessage();
			System.out.println("��������Ϊ0:"+str);
		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println("�������δ֪�쳣");
		}
		
		
		System.out.println("��лʹ�ã�");
		
		
		
	}

}
