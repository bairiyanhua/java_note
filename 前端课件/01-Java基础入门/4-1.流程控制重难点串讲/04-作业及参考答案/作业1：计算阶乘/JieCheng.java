import java.util.Scanner;


public class JieCheng {

	public static void main(String[] args) {
	
		int n ;
		int result=1;//阶乘的结果
		
		Scanner in = new Scanner(System.in);
		System.out.println("请输入一个正整数：");
		n = in.nextInt();
		int sum = 0;
		for(int i=1;i<=n;i++)
		{
			result*=i;  //result= result*i;
			sum+=result;
		}
		System.out.println(n+"的阶乘是："+result);
		System.out.println("1+2!+...+n!="+sum);
	}
}


