package com.kgc.exam;

public class User {
	
	public String name;
	public String password;
	public int age;
	public int sex; //1-ÄÐ  2-Å®
	public String nickname;
	public double height;
	public double weight;
	
	public void show(User aa){
		System.out.println(aa.name);
		System.out.println(aa.password);
	}
	
}
