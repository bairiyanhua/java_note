package com.kgc.exam.entity;

/**
 * �����ײ�
 * 
 * @author Administrator
 * 
 */
public class SuperPackage extends PackService {

	private int talkTime; // ͨ��ʱ��
	private int flow; // ��������
	private int smsCount; // ��������

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
		System.out.println("�����ײͣ�ͨ��ʱ��Ϊ"+talkTime+"����/�£���������Ϊ"+smsCount+"��/�£���������Ϊ"+flow/1024+"GB/�¡�");
	}

}
