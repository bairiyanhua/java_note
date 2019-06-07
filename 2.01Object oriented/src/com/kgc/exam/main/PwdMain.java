package com.kgc.exam.main;

import java.util.Scanner;

import com.kgc.exam.Password;

public class PwdMain {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Password pwd = new Password();
		
		System.out.print("请输入用户名：");
		pwd.name = input.next();
		
		System.out.print("请输入密码：");
		pwd.pwd = input.next();
		
		boolean same = pwd.panduan();
		
		if(same){
			System.out.print("请输入新密码：");
			String newPwd = input.next();
			System.out.println("修改密码成功，您的新密码为：" + newPwd);
		}else{
			System.out.println("用户名和密码不匹配！您没有权限更新管理员信息。");
		}
		
	}

}
