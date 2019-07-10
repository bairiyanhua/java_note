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
		
		//隐式对象
		String dateStr = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
		
		//时间戳
		String date = new SimpleDateFormat("yyyyMMddHHmmsssss").format(new Date());
		System.out.println(date);
		
		//Calendar类设置时间
		Calendar ca = Calendar.getInstance();
		
		//获取
		System.out.println(ca.get(Calendar.YEAR));
		System.out.println(ca.get(Calendar.MONTH)+1); //月份是从0开始的
		System.out.println(ca.get(Calendar.DAY_OF_MONTH));
		System.out.println(ca.get(Calendar.HOUR_OF_DAY));
		System.out.println(ca.get(Calendar.MINUTE));
		System.out.println(ca.get(Calendar.SECOND));
		
		System.out.println("=======================================");
		
		//设置
		ca.set(Calendar.YEAR, 2020);
		ca.set(1970, 0, 1); //月份是从0开始的
		ca.set(1990, 9, 1, 12, 00, 00); //1990年10月1号中午12点
		
		System.out.println(ca.get(Calendar.YEAR));
		
	}
}
