package com.kgc.exam;

import java.util.ArrayList;
import java.util.List;

public class Demo2 {
	
	public static void main(String[] args) {
		
		User user1 = new User(1, "����", "123456", 25, 0);
		User user2 = new User(2, "����", "123456", 25, 0);
		User user3 = new User(3, "����", "123456", 25, 0);
		User user4 = new User(4, "����", "123456", 25, 0);
		User user5 = new User(5, "�����", "123456", 25, 0);
		User user6 = new User(6, "����", "123456", 25, 0);
		
		List list = new ArrayList();
		list.add(user1);
		list.add(user2);
		list.add(user3);
		list.add(user4);
		list.add(user5);
		list.add(user6);
		
		for (int i = 0; i < list.size(); i++) {
			User user = (User)list.get(i);
			System.out.println(user.getId() + " : " + user.getUsername() + " - " + user.getPassword());
		}
		
		
	}

}
