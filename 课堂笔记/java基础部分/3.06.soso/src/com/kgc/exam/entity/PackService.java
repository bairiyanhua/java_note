package com.kgc.exam.entity;

/**
 * 三个套餐的父类
 * 
 * @author Administrator
 * 
 */
public abstract class PackService {

	private double price;

	/**
	 * 打印套餐信息
	 */
	public abstract void showInfo();
	
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
