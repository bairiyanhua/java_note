/*
 * 打印等腰三角形
 * */
public class PrintSJX {
	public static void main(String[] args) {
		//外层循环，执行五次，每次输出一行*
		for (int i = 1; i <= 5; i++) {
			for(int j=1;j<=5-i;j++){
				System.out.print(" ");
			}
			//内层循环，执行五次，每次输出一个*
			for (int j = 1;j<=2*i-1;j++){
				System.out.print(i);
			}
			
			System.out.println();
		}
	}
}
