package com.kgc.exam;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
	
	public static void main(String[] args) {
		
		Map map = new TreeMap();
		
		//增加  put(key, value)
		map.put("CN", "中华人民共和国");
		map.put("US", "美国");
		map.put("RU", "俄国");
		map.put("aa", null);
		map.put(null, "aa");
		
		System.out.println("========"+map.get(null));
		
		
		//取值 get()  通过key 取 value
		System.out.println(map.get("CN"));
		
		//修改
		map.put("CN","中国");
		System.out.println(map.get("CN"));
		
		//删除
		map.remove("US");
		
		
		System.out.println(map.get("US"));
		
	}

}
