package com.bdqn;

import java.util.Scanner;

public class SimpleIfElse {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
        System.out.print("�����źƵ�Java�ɼ�: "); //��ʾҪ����Java�ɼ�
        int score =  input.nextInt(); 	//�ӿ���̨��ȡJava�ɼ�
        if ( score > 90 ) {
            System.out.println("��ʦ˵:��������һ��iPhone5��");
        }else{
        	System.out.println("��ʦ˵:�ͷ���5��������");
        }
	}
}
