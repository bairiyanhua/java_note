package com.kgc.exam.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
//		long date = System.currentTimeMillis();
//		System.out.println(date);
		
		// 2019-6-4 12:05:30
//		Date date = new Date();
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		String dateStr = sdf.format(date);
		
		//��ʽ����
		String dateStr = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
		
		//ʱ���
		String date = new SimpleDateFormat("yyyyMMddHHmmsssss").format(new Date());
		System.out.println(date);
		
		//Calendar������ʱ��
		Calendar ca = Calendar.getInstance();
		
		//��ȡ
		System.out.println(ca.get(Calendar.YEAR));
		System.out.println(ca.get(Calendar.MONTH)+1); //�·��Ǵ�0��ʼ��
		System.out.println(ca.get(Calendar.DAY_OF_MONTH));
		System.out.println(ca.get(Calendar.HOUR_OF_DAY));
		System.out.println(ca.get(Calendar.MINUTE));
		System.out.println(ca.get(Calendar.SECOND));
		
		System.out.println("=======================================");
		
		//����
		ca.set(Calendar.YEAR, 2020);
		ca.set(1970, 0, 1); //�·��Ǵ�0��ʼ��
		ca.set(1990, 9, 1, 12, 00, 00); //1990��10��1������12��
		
		System.out.println(ca.get(Calendar.YEAR));
		
	}
}
