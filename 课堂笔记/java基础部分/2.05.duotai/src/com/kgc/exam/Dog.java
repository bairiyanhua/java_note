package com.kgc.exam;

public class Dog extends Pet {

	private String kind;

	/**
	 * 子类重写父类的方法
	 * 也是多态的一种表现形式
	 */
	@Override
	public void show() {
//		System.out.println("狗狗的自白：");
//		System.out.println("我的名字是："+getName()+",健康值是："+getHealth()+",和主人的亲密度是："+getLove()+",我是一只："+kind);
		super.show();
		System.out.println("我是一只："+kind);
	}
	
	public String getKind() {
		return kind;
	}

	public void setKind(int aa) {
		if(aa == 1){
			this.kind = "世界大暖男金毛";
		}else if(aa == 2){
			this.kind = "拆家小能手二哈";
		}else{
			System.out.println("输入错误！系统为您默认分配");
			this.kind = "中华田园神犬";
		}
		
	}

}
