package com.kgc.exam;


public class WeekMain {
	
	public static void main(String[] args) {
		
		Week day = Week.Friday;
		
		if("Monday".equals(day.toString())){
			System.out.println("����һ");
		}else if("Tuesday".equals(day.toString())){
			System.out.println("���ڶ�");
		}else if("Wednesday".equals(day.toString())){
			System.out.println("������");
		}else if("Thursday".equals(day.toString())){
			System.out.println("������");
		}else if("Friday".equals(day.toString())){
			System.out.println("������");
		}else if("Saturday".equals(day.toString())){
			System.out.println("������");
		}else if("Sunday".equals(day.toString())){
			System.out.println("������");
		}
		
		
		
	}

}
