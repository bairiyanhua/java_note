package cn.kgc;

import java.util.Scanner;

public class LuckNo {
	   public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入8位用户编号：");
		Long custNo = input.nextLong();
		int sum = 0;
		do{
			sum+=custNo%10;
			custNo=custNo/10;
		}while(custNo!=0);
		
		if(sum%7==0){
			System.out.println("恭喜您，中奖啦，请领取现金500万！");
		}else{
			System.out.println("很遗憾，您没有中奖，谢谢支持！");
		}
	  }

}
