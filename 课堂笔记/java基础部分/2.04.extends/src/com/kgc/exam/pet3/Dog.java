package com.kgc.exam.pet3;

public class Dog extends Pet {

	private String kind;
	
	public void show(){
		System.out.println("�������԰ף�");
		System.out.println("�ҵ����ֽ�"+getName()+",����ֵ�ǣ�"+getHealth()+",�����˵����ܶ��ǣ�"+getLove()+",����һֻ"+kind);
	}
	
	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

}
