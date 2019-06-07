package com.kgc.exam;

public class Password {
	
	public String name;
	public String pwd;
	
	public boolean panduan(){
		if("admin".equals(name) && "123456".equals(pwd)){
			return true;
		}
		return false;
	}

}
