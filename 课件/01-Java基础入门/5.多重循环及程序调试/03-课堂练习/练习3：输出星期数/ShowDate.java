import java.util.*;
public class ShowDate {
	public static void main(String[] args){
		//�������
		int inputNum = -1;  //��¼�û�����
		Scanner input = new Scanner(System.in);
		String date = "";  //��¼���ڼ�
		//ѭ��ѯ���û����������
		do{
			//ѯ���û���������֣�
			System.out.print("���������֣�1~7��������0������");
			inputNum = input.nextInt();
			//��֧�������û���������ݣ���ʾ��Ӧ���ڼ�
			switch(inputNum){
			case 1:
				//System.out.println("����һ");
				date = "����һ";
				break;
			case 2:
				//System.out.println("���ڶ�");
				date = "���ڶ�";
				break;
			case 3:
				System.out.println("������");
				date = "������";
				break;
			case 4:
				//System.out.println("������");
				date = "������";
				break;
			case 5:
				//System.out.println("������");
				date = "������";
				break;
			case 6:
				//System.out.println("������");
				date = "������";
				break;
			case 7:
				//System.out.println("������");
				date = "������";
				break;
			case 0:
				break;
			default:
				System.out.println("������������");	
				break;
			}
			if(inputNum>=1 && inputNum<=7){
			System.out.println(date);
			}
			
		}while(inputNum != 0);
		System.out.println("���������");
	}
}
