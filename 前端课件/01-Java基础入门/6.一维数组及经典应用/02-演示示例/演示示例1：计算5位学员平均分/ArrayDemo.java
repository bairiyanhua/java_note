
import java.util.Scanner;

public class ArrayDemo {

	/**
	 * 使用数组计算平均分
	 */
	public static void main(String[] args) {
		int[] scores = new int[5];	//成绩数组
		int sum = 0;				//成绩总和
		Scanner input = new Scanner(System.in);
		System.out.println("请输入5位学员的成绩：");
		for(int i = 0; i < scores.length; i++){
			scores[i] = input.nextInt();
			sum = sum + scores[i];	//成绩累加
		}
		/*//使用foreach遍历
		for(int i = 0; i < scores.length; i++){
			scores[i] = input.nextInt();
		}
		for(int score:scores){
			sum+=score;
		}*/
		//计算并输出平均分
		System.out.println("学员的平均分是：" + (double)sum/scores.length);
	}
}
