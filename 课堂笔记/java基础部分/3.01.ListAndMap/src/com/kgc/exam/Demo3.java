package com.kgc.exam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 泛型
 * @author Administrator
 *
 */
public class Demo3 {
	
	public static void main(String[] args) {
		
		List<String> aa = new ArrayList<String>();
		aa.add("123456");
		
		User user1 = new User(1, "张三", "123456", 25, 0);
		User user2 = new User(2, "李四", "123456", 25, 0);
		User user3 = new User(3, "王五", "123456", 25, 0);
		List<User> bb = new ArrayList<User>();
		bb.add(user1);
		bb.add(user2);
		bb.add(user3);
		
		for (int i = 0; i < bb.size(); i++) {
			User user = bb.get(i);
		}
		
		Set<String> set = new HashSet<String>();
		set.add("123456");
//		set.add(1);
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("123", "123456");
		
		
	}
	

}
