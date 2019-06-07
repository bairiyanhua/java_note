package com;

public class Demo1 {
	public static void main(String[] args) {
		int i = 1;
		while(i <= 5){
			System.out.println("==这里是外层循环===");
			i++;
			
			int j = 1;
			while(j <= 5){
				System.out.println("这里是内层循环");

				if(j == 3){
					break;
				}
				
				j++;
			}
		}
		
		
		
		
	}

}
