package com.kgc.exam.pet2;

public class Penguin extends Pet {

	private String sex;

	@Override
	public void show() {
		System.out.println("�������԰ף�");
		System.out.println("�ҵ������ǣ�"+getName()+",����ֵ�ǣ�"+getHealth()+",�����˵����ܶ��ǣ�"+getLove()+",�ҵ��Ա��ǣ�"+sex);
	}
	
	public String getSex() {
		return sex;
	}

	public void setSex(int sex) {
		if(sex == 1){
			this.sex = "Q��";
		}else if(sex == 2){
			this.sex = "Q��";
		}else{
			System.out.println("�������ϵͳΪ��Ĭ���Ա�");
			this.sex = "Q��";
		}
	}

}
