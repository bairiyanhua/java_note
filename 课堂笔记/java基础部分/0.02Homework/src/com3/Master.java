package com3;

import com2.Dog;
import com2.Penguin;
import com2.Pet;

public class Master {	

		public void feed(Pet pet){
		if(pet instanceof Dog){
			System.out.println("给狗狗吃狗粮");
		}else if(pet instanceof Penguin){
			System.out.println("给企鹅吃小鱼干");
		}
	}
}
