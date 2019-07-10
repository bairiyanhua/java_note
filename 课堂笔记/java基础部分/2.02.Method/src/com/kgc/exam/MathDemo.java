package com.kgc.exam;

public class MathDemo {
	
	public double java;
	public double c;
	public double db;
	
	/**
	 * 无参方法
	 * @return
	 */
	public double sum(){
		return java+c+db;
	}
	
	/**
	 * 有参方法
	 * @param java
	 * @param c
	 * @param db
	 * @return
	 */
	public double sum(double java, double c, double db){
		this.java = java;
		return java+c+db;
	}
	
	public String sum(String java, double c, double db){
		return "";
	}
	
	
	
	
	
	
	
	
	

}
