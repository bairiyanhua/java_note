package com.kgc.exam.entity;

/**
 * 网虫套餐
 * 
 * @author Administrator
 * 
 */
public class NetPackage extends PackService {

	private int flow; // 上网流量 单位为MB

	public int getFlow() {
		return flow;
	}

	public void setFlow(int flow) {
		this.flow = flow;
	}

	/**
	 * 重写父类方法
	 * 打印套餐信息
	 */
	@Override
	public void showInfo() {
		System.out.println("网虫套餐：上网流量是"+flow/1024+"GB/月,月资费是"+getPrice()+"元/月。");
		
	}

}
