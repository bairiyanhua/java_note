package com.kgc.exam.pet2;

public class Dog extends Pet {

	private String kind;

	public Dog(){
		super();
	}
	
	public Dog(String name, int health, int love, String kind){
		super(name, health, love);
		this.kind = kind;
	}
	
	
	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

}
