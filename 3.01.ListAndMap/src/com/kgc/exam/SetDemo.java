package com.kgc.exam;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
	
	public static void main(String[] args) {
		
		Set set = new HashSet();
		//����  add()
		set.add(1);
		set.add(true);
		set.add("����");
		set.add("����");
		set.add("����");
		set.add("����");
		set.add("�����");
		
		//ɾ��
		set.remove("����");
		
		
		//��ȡ  ѭ��
		for (Object object : set) {
			String aa = (String)object;
			System.out.println(aa);
		}
		
		
		Iterator it = set.iterator();
		while(it.hasNext()){
			String val = (String)it.next();
			System.out.println(val);
		}
		
		
	}

}
