/*
 * ��ӡ����������
 * */
public class PrintSJX {
	public static void main(String[] args) {
		//���ѭ����ִ����Σ�ÿ�����һ��*
		for (int i = 1; i <= 5; i++) {
			for(int j=1;j<=5-i;j++){
				System.out.print(" ");
			}
			//�ڲ�ѭ����ִ����Σ�ÿ�����һ��*
			for (int j = 1;j<=2*i-1;j++){
				System.out.print(i);
			}
			
			System.out.println();
		}
	}
}
