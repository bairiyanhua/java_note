package com.kgc.exam;

public class MathDemo {
	
	public double java;
	public double c;
	public double db;
	
	/**
	 * �޲η���
	 * @return
	 */
	public double sum(){
		return java+c+db;
	}
	
	/**
	 * �вη���
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
