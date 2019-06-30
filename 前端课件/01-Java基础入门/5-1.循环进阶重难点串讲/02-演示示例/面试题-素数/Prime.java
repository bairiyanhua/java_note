import java.util.Scanner;


public class Prime {

	public static void main(String[] args) {
	
		public static void main(String[] args) {
		int flag = 0;
		for(int i=1;i<=100;i++){
			for(int j=2;j<i;j++){
				
				if(i%j==0){
					flag =1;  //标志位，不是质数
					break;
				}
			}
			if(flag==0){
				System.out.print(i+"\t");
			}
			flag = 0; //标志位清空
		}
		System.out.println();
		
		//更简单的方法：
		for(int i=1;i<=100;i++){
			for(int j=2;j<=Math.sqrt(i);j++){
				
				if(i%j==0){
					flag =1;  //标志位，不是质数
					break;
				}
			}
			if(flag==0){
				System.out.print(i+"\t");
			}
			flag = 0;
		}
	}

}
