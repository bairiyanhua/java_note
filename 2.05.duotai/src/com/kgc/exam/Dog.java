package com.kgc.exam;

public class Dog extends Pet {

	private String kind;

	/**
	 * ������д����ķ���
	 * Ҳ�Ƕ�̬��һ�ֱ�����ʽ
	 */
	@Override
	public void show() {
//		System.out.println("�������԰ף�");
//		System.out.println("�ҵ������ǣ�"+getName()+",����ֵ�ǣ�"+getHealth()+",�����˵����ܶ��ǣ�"+getLove()+",����һֻ��"+kind);
		super.show();
		System.out.println("����һֻ��"+kind);
	}
	
	public String getKind() {
		return kind;
	}

	public void setKind(int aa) {
		if(aa == 1){
			this.kind = "�����ů�н�ë";
		}else if(aa == 2){
			this.kind = "���С���ֶ���";
		}else{
			System.out.println("�������ϵͳΪ��Ĭ�Ϸ���");
			this.kind = "�л���԰��Ȯ";
		}
		
	}

}
