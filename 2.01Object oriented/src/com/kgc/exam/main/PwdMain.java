package com.kgc.exam.main;

import java.util.Scanner;

import com.kgc.exam.Password;

public class PwdMain {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Password pwd = new Password();
		
		System.out.print("�������û�����");
		pwd.name = input.next();
		
		System.out.print("���������룺");
		pwd.pwd = input.next();
		
		boolean same = pwd.panduan();
		
		if(same){
			System.out.print("�����������룺");
			String newPwd = input.next();
			System.out.println("�޸�����ɹ�������������Ϊ��" + newPwd);
		}else{
			System.out.println("�û��������벻ƥ�䣡��û��Ȩ�޸��¹���Ա��Ϣ��");
		}
		
	}

}
