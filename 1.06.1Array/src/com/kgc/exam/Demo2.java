package com.kgc.exam;

import java.util.Arrays;

/**
 * ʹ��Arrays��
 * @author Administrator
 */
public class Demo2 {
	public static void main(String[] args) {
		
		int[] aa = {2,4,5,8,1};
		int[] bb = {1,2,2};
		
		//�ж����������Ƿ���ͬ�������ͬ������true������ͬ����false
		boolean a = Arrays.equals(aa, bb);
		System.out.println(a);
		
		//����ֵ��������С��������
		Arrays.sort(aa);
		for (int i = 0; i < aa.length; i++) {
			System.out.print(aa[i]+" ");
		}
		System.out.println();
		System.out.println("========================================");
		//���������ַ���
		String b = Arrays.toString(aa);
		System.out.println(b);
		
		int[] cc = new int[5];
		//��һ���յ�����ȫ��Ԫ�ظ�ֵΪָ����ֵ
		Arrays.fill(cc, 250);
		System.out.println(Arrays.toString(cc));
		
		//��ָ�������и���ָ�����ȵ�Ԫ��
		int[] dd = Arrays.copyOf(aa, 7);
		System.out.println(Arrays.toString(dd));
		
		//��ָ�������в���ָ��Ԫ�ص��±�
		//ǰ�᣺�������Ҫ�Ȱ���С��������
		int d = Arrays.binarySearch(aa, 8);
		System.out.println(d);
		
		
		
		
		
		
		
		
	}

}
