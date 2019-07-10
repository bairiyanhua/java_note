package com.kgc.exam.entity;

/**
 * 超人套餐
 * 
 * @author Administrator
 * 
 */
public class SuperPackage extends PackService {

	private int talkTime; // 通话时长
	private int flow; // 上网流量
	private int smsCount; // 短信条数

	public int getTalkTime() {
		return talkTime;
	}

	public void setTalkTime(int talkTime) {
		this.talkTime = talkTime;
	}

	public int getFlow() {
		return flow;
	}

	public void setFlow(int flow) {
		this.flow = flow;
	}

	public int getSmsCount() {
		return smsCount;
	}

	public void setSmsCount(int smsCount) {
		this.smsCount = smsCount;
	}

	@Override
	public void showInfo() {
		System.out.println("超人套餐：通话时长为"+talkTime+"分钟/月，短信条数为"+smsCount+"条/月，上网流量为"+flow/1024+"GB/月。");
	}

}
