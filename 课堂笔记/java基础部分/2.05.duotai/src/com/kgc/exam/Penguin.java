package com.kgc.exam;

public class Penguin extends Pet {

	private String sex;

	@Override
	public void show() {
		super.show();
		System.out.println("我的性别是："+sex);
	}
	
	public String getSex() {
		return sex;
	}

	public void setSex(int sex) {
		if(sex == 1){
			this.sex = "Q仔";
		}else if(sex == 2){
			this.sex = "Q妹";
		}else{
			System.out.println("输入错误，系统为您默认性别！");
			this.sex = "Q仔";
		}
	}

}
