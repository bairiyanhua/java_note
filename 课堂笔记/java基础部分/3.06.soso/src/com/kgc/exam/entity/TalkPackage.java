package com.kgc.exam.entity;

/**
 * 话唠套餐
 * 
 * @author Administrator
 * 
 */
public class TalkPackage extends PackService {

	private int talkTime; // 通话时长(分钟)
	private int smsCount; // 短信条数（条）

	public int getTalkTime() {
		return talkTime;
	}

	public void setTalkTime(int talkTime) {
		this.talkTime = talkTime;
	}

	public int getSmsCount() {
		return smsCount;
	}

	public void setSmsCount(int smsCount) {
		this.smsCount = smsCount;
	}

	@Override
	public void showInfo() {
		System.out.println("话唠套餐：通话时长为" + talkTime + "分钟/月，短信条数为"
				+ smsCount + "条/月，资费为" + getPrice() + "元/月。");
	}

}
