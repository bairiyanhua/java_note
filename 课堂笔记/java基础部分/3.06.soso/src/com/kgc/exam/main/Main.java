package com.kgc.exam.main;

import java.util.Scanner;

import com.kgc.exam.util.CardUtil;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		CardUtil util = new CardUtil();
		
		do {
			System.out.println();
			System.out.println("*************��ӭʹ�����ƶ�ҵ�����***************");
			System.out.println("1.�û���¼   2.�û�ע��   3.ʹ����   4.���ѳ�ֵ  5.�ʷ�˵��  6.�˳�ϵͳ");
			System.out.print("��ѡ��:");
			int choose = input.nextInt();
			if(choose==1){
				System.out.println("---�û���¼---");
			}else if(choose==2){
				System.out.println("---�û�ע��---");
			}else if(choose==3){
				System.out.println("---ʹ����---");
			}else if(choose==4){
				System.out.println("---���ѳ�ֵ---");
				System.out.print("�������ֵ���ţ�");
				String cardno = input.next();
				
				if(util.isExits(cardno)){
					System.out.print("�������ֵ��");
					double money = input.nextDouble();
					//���÷�����ֵ
					
					
				}else{
					System.out.println("�Բ���Ҫ��ֵ�Ŀ���δע�ᣬ�޷���ֵ��");
				}
				
				
			}else if(choose==5){
				System.out.println("---�ʷ�˵��---");
				//���÷�����ӡ�ʷ�˵��
				util.showMsg();
				
			}else if(choose==6){
				System.out.println("---�˳�ϵͳ---");
				System.out.println("ллʹ�ã�");
				break;
				
			}else{
				System.out.println("�Բ���û�д�ѡ�");
			}
			
			
		} while (true);
		
		
		
		
		
	}
	
}
