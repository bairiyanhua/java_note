package cn.jbit.epet.purview2;

import cn.jbit.epet.purview.Pet;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//System.out.println(new Pet().color); //不同包下，不能使用protected成员
		System.out.println(new Pet().id);// 同包下，可以使用public成员
	}

}
