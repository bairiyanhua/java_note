package com.bdqn;

import java.util.Scanner;

public class GetPrize2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
        System.out.print("�����źƵ�Java�ɼ�: "); //��ʾҪ����Java�ɼ�
        int score1 =  input.nextInt(); 	//�ӿ���̨��ȡJava�ɼ�
        System.out.print("�����źƵ����ֳɼ�: "); //��ʾҪ�������ֳɼ�
        int score2 =  input.nextInt(); 	//�ӿ���̨��ȡ���ֳɼ�
        if ((score1>90 && score2>80) || (score1==100 && score2>70)) {
             System.out.println("��ʦ˵:��������һ��iPhone5��");
        }
	}
}
