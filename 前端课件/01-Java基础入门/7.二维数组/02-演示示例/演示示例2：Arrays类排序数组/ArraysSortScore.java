import java.util.Arrays;
import java.util.Scanner;

/*
 * Arrays����5��ѧԱ�ɼ�
 * */
public class ArraysSortScore {
	public static void main(String[] args) {
		int[] scores=new int[5];
		Scanner input=new Scanner(System.in);
		System.out.println("������5��ѧԱ�ĳɼ���");
		//��ȡѧԱ�ɼ�
		for(int i=0;i<scores.length;i++){
			scores[i]=input.nextInt();
		}
		Arrays.sort(scores);
		System.out.print("ѧԱ�ɼ����������У�");
		for(int score:scores){
			System.out.print(score+"\t");
		}
		
		System.out.print("\nѧԱ�ɼ����������У�");
		for(int i=scores.length-1;i>=0;i--){
			System.out.print(scores[i]+"\t");
		}
	}
}
