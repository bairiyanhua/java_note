package com.kgc.exam.Math;

import java.util.Random;

public class MathDemo {
	
	public static void main(String[] args) {
		
		//����ȡ��
		System.out.println(Math.ceil(2.01));
		
		//����ȡ��
		System.out.println(Math.floor(2.9999));
		
		//��������
		System.out.println(Math.round(3.4));
		
		//����� 0-1֮�����������0������1
		System.out.println(Math.random());
		
		//ȡ1-9֮����������
		System.out.println((int)(Math.random()*9)+1);
		System.out.println(Math.ceil(Math.random()*9));
		
		Random ran = new Random();
		System.out.println(ran.nextInt(9)+1);
		
		
		
	}
	
	

}
