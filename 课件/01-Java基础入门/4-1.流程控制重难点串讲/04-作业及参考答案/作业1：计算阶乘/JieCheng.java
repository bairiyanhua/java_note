import java.util.Scanner;


public class JieCheng {

	public static void main(String[] args) {
	
		int n ;
		int result=1;//�׳˵Ľ��
		
		Scanner in = new Scanner(System.in);
		System.out.println("������һ����������");
		n = in.nextInt();
		int sum = 0;
		for(int i=1;i<=n;i++)
		{
			result*=i;  //result= result*i;
			sum+=result;
		}
		System.out.println(n+"�Ľ׳��ǣ�"+result);
		System.out.println("1+2!+...+n!="+sum);
	}
}


