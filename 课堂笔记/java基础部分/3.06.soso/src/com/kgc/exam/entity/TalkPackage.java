package com.kgc.exam.entity;

/**
 * �����ײ�
 * 
 * @author Administrator
 * 
 */
public class TalkPackage extends PackService {

	private int talkTime; // ͨ��ʱ��(����)
	private int smsCount; // ��������������

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
		System.out.println("�����ײͣ�ͨ��ʱ��Ϊ" + talkTime + "����/�£���������Ϊ"
				+ smsCount + "��/�£��ʷ�Ϊ" + getPrice() + "Ԫ/�¡�");
	}

}
