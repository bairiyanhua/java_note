import java.util.Scanner;

/*
 * ð������5��ѧԱ�ɼ�
 * */
public class SortScore {
	public static void main(String[] args) {
		int[] scores=new int[5];
		Scanner input=new Scanner(System.in);
		System.out.println("������5��ѧԱ�ĳɼ���");
		//��ȡѧԱ�ɼ�
		for(int i=0;i<scores.length;i++){
			scores[i]=input.nextInt();
		}
		//ð������ѧԱ�ɼ�
		for (int i = 0; i < scores.length -1 ; i++)
		{
		      for (int j = 0; j < scores.length -1 - i ; j++)
		      {
		            if (scores[j] < scores[j + 1])
		            { 
		                  // ����Ԫ��
		                  int temp = scores[j];
		                  scores[j] = scores[j + 1];
		                  scores[j + 1] = temp;
		            }
		      }
		}
		System.out.print("ѧԱ�ɼ����������У�");
		for(int score:scores){
			System.out.print(score+"\t");
		}
	}
}
