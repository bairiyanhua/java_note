package com;

public class Triangler {
	int a;
	int b;
	int c;
	public String shape;
	public boolean isTrue(int a,int b,int c){
		boolean result=false;
		if(a+b>c||a+c>b||b+c>a){
	}
	return result;
	
	}
public String whatShape(int a,int b,int c){
	if(a==b&&b==c&&a==c){
		shape="等边三角形";
	}else if(a*a==b*b+c*c||b*b==a*a+c*c||c*c==a*a+b*b){
		shape="直角三角形";
	}else if(a*a>b*b+c*c||b*b>a*a+c*c||c*c>a*a+b*b){
		shape="钝角三角形";
	}
	return shape;
	}
}
