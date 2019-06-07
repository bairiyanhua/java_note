package com;

import java.util.Scanner;

public class TrianglerMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Triangler sd=new Triangler();
		boolean isGo=false;
		do{
			System.out.println("请输入三角形的第一个边长");
			int a =sc.nextInt();
			System.out.println("请输入三角形的第二个边长");
			int b =sc.nextInt();
			System.out.println("请输入三角形的第三个边长");
			int c =sc.nextInt();
			if(!sd.isTrue(a, b, c)){
			System.out.println("不能构成三角形");
			}else{
				System.out.println("这是"+sd.whatShape(a, b, c));
			}
			System.out.println("继续吗（y/n):");
			if ("y".equals(sc.next())){
				isGo=true;
				
			}
		}while(isGo);
		System.out.println("谢谢使用！");
			
			
		}
	}
	
