package com;

public class Switch {
	public static void main(String[] args) {
		
		int mingci = 1;
		
		/*if(mingci == 1){
			System.out.println("第一名");
		}else if(mingci == 2){
			System.out.println("第二名");
		}else if(mingci == 3){
			System.out.println("第三名");
		}else{
			System.out.println("三名开外，没名次");
		}*/
		switch(mingci){
			case 1:
				System.out.println("第一名");
				break;
			case 2:
				System.out.println("第二名");
				break;
			case 3:
				System.out.println("第三名");
				break;
			default:
				System.out.println("三名开外，没名次");
				break;
		}
		
		
		
	}
}
