package com.kgc.exam.entity;

/**
 * �����ײ͵ĸ���
 * 
 * @author Administrator
 * 
 */
public abstract class PackService {

	private double price;

	/**
	 * ��ӡ�ײ���Ϣ
	 */
	public abstract void showInfo();
	
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
