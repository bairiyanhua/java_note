package com.kgc.exam.main;

import com.kgc.exam.User;

public class UserMain {
	
	public static void main(String[] args) {
		
		User user = new User();
		user.name = "уехЩ";
		user.password = "123456";
		
		user.show(user);
		
		for (int i = 0; i < 10; i++) {
			user.age = 25;
			System.out.println(i);
		}
		
		for (int j = 0; j < args.length; j++) {
			System.out.println(j);
		}
		
	}

}
