/*
 * Ã°ÅÝÅÅÐò
 * */
public class SortNum {
	public static void main(String[] args) {
		int[] scores={16,25,9,90,23};
		for (int i = 0; i < scores.length -1 ; i++)
		{
		      for (int j = 0; j < scores.length -1 - i ; j++)
		      {
		            if (scores[j] > scores[j + 1])
		            { 
		                  // ½»»»ÔªËØ
		                  int temp = scores[j];
		                  scores[j] = scores[j + 1];
		                  scores[j + 1] = temp;
		            }
		      }
		}
		System.out.println("Ã°ÅÝÅÅÐòºó£º");
		for(int score:scores){
			System.out.print(score+"\t");
		}
	}
}
