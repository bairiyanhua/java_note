package com.kgc.exam;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Demo1 {
	
	public static void main(String[] args) {
		
		List aa = new ArrayList();
//		List aa = new LinkedList();
		//����  add()
		aa.add(1);
		aa.add(true);
		aa.add('a');
		aa.add("����");
		aa.add("����");
		aa.add("�����");
		
		//��ȡ/��  get()
		System.out.println(aa.get(0));
		
		//����  size()
		System.out.println(aa.size());
		
		//ɾ��  remove()
		aa.remove(0);
		aa.remove("����");
		
		//�޸� set()
		aa.set(0, "aaaaa");
		
		System.out.println(aa.get(0));
		
		//�Ƿ����
		System.out.println(aa.contains("aaaaa"));
		
		
		//��������
		for (int i = 0; i < aa.size(); i++) {
			System.out.print(aa.get(i) + " == ");
		}
		
	}

}
