import java.util.Scanner;

/**
 * ��֪��3���༶��5��ѧԱ����ʹ�ö�ά�����������༶���ܳɼ�
 * */
public class ThreeTotal {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int [][] array = new int[3][5]; //3����ĳɼ�
		//i:�༶  j:���༶��ѧ��
		for(int i=0;i<array.length;i++){
			System.out.println("**********��"+(i+1)+"����**********");
			for(int j=0;j< array[i].length;j++){
				System.out.print("�������"+(j+1)+"��ѧ���ĳɼ�:");
				array[i][j]=input.nextInt();
				
			}
		}
		System.out.println("***********�ɼ�ͳ��************");
		int total; //�����ܳɼ�
		for(int i = 0; i < array.length; i++) {
	        String str = (i+1) + "��";
	        total = 0; //ÿ��ѭ�����˶������0
	        for(int j = 0; j < array[i].length; j++) {
	        	total += array[i][j]; //�ɼ�����
	        }
	        System.out.println(str+"�ܳɼ���" + total);
		}
	}
}
