package com.kgc.exam.main;

import java.util.Scanner;

import com.kgc.exam.Visitor;

public class VisitorMain {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Visitor visitor = new Visitor();
		
		do {
			System.out.print("������������");
			visitor.name = input.next();
			if("n".equals(visitor.name)){
				break;
			}
			
			System.out.print("���������䣺");
			visitor.age = input.nextInt();
			
			visitor.show();
			
		} while (true);
		System.out.println("�˳�����");
		
		
	}

}
