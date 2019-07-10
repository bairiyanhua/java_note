package com.kgc.exam;


public class WeekMain {
	
	public static void main(String[] args) {
		
		Week day = Week.Friday;
		
		if("Monday".equals(day.toString())){
			System.out.println("星期一");
		}else if("Tuesday".equals(day.toString())){
			System.out.println("星期二");
		}else if("Wednesday".equals(day.toString())){
			System.out.println("星期三");
		}else if("Thursday".equals(day.toString())){
			System.out.println("星期四");
		}else if("Friday".equals(day.toString())){
			System.out.println("星期五");
		}else if("Saturday".equals(day.toString())){
			System.out.println("星期六");
		}else if("Sunday".equals(day.toString())){
			System.out.println("星期日");
		}
		
		
		
	}

}
