package com.kgc.exam;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
	
	public static void main(String[] args) {
		
		User user1 = new User(1, "张三", "123456", 25, 0);
		User user2 = new User(2, "李四", "123456", 25, 0);
		User user3 = new User(3, "王五", "123456", 25, 0);
		User user4 = new User(4, "赵六", "123456", 25, 0);
		User user5 = new User(5, "鬼脚七", "123456", 25, 0);
		User user6 = new User(6, "王八", "123456", 25, 0);
		
		Map map = new HashMap();
		map.put("user1", user1);
		map.put("user2", user2);
		map.put("user3", user3);
		map.put("user4", user4);
		map.put("user5", user5);
		map.put("user6", user6);
		
		//能过key取value
		Set keys = map.keySet();
		//1. 增加for循环
		for (Object obj : keys) {
			String key = (String)obj;
			User user = (User)map.get(key);
			System.out.println(user.getId() + " : " + user.getUsername() + " - " + user.getPassword());
		}
		
		System.out.println("======================================================");
		
		//2. 迭代器循环
		Iterator it = keys.iterator();
		while(it.hasNext()){
			String key = (String)it.next();
			User user = (User)map.get(key);
			System.out.println(user.getId() + " : " + user.getUsername() + " - " + user.getPassword());
		}
		
		
		
		
		
	}

}
