package com.kgc.exam.entity;

/**
 * �����ײ�
 * 
 * @author Administrator
 * 
 */
public class NetPackage extends PackService {

	private int flow; // �������� ��λΪMB

	public int getFlow() {
		return flow;
	}

	public void setFlow(int flow) {
		this.flow = flow;
	}

	/**
	 * ��д���෽��
	 * ��ӡ�ײ���Ϣ
	 */
	@Override
	public void showInfo() {
		System.out.println("�����ײͣ�����������"+flow/1024+"GB/��,���ʷ���"+getPrice()+"Ԫ/�¡�");
		
	}

}
