package com.kgc.exam;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
	
	public static void main(String[] args) {
		
		Map map = new TreeMap();
		
		//����  put(key, value)
		map.put("CN", "�л����񹲺͹�");
		map.put("US", "����");
		map.put("RU", "���");
		map.put("aa", null);
		map.put(null, "aa");
		
		System.out.println("========"+map.get(null));
		
		
		//ȡֵ get()  ͨ��key ȡ value
		System.out.println(map.get("CN"));
		
		//�޸�
		map.put("CN","�й�");
		System.out.println(map.get("CN"));
		
		//ɾ��
		map.remove("US");
		
		
		System.out.println(map.get("US"));
		
	}

}
