import java.util.*;

public class GuessData {

	public static void main(String[] args) {
		int[] list = new int[] { 8, 4, 2, 1, 23, 344, 12 }; // 创建数组并赋值
		
		int sum=0;
		//循环输出数列的值
		//求数列中所有数值的和
		for(int num:list){
			System.out.println(num);
			sum+=num;
		}
		System.out.println("数组元素之和为："+sum);

		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个整数： ");
		int guess = input.nextInt();
		boolean isCorrect = false;
		for (int i = 0; i < list.length; i++) {
			if (guess == list[i]) {
				isCorrect = true;
				break;
			}
		}
		if (isCorrect) {
			System.out.println("猜对了！");
		} else {
			System.out.println("Sorry！");
		}
	}

}
