import java.util.Scanner;

/**
 * ���ҽ���
 * @author administrator
 *
 */
public class Introduction {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name = "С��"; //����
		int age = 25; //����
		int year = 5;  //��������
		int projectNum = 3;  //��ɵ���Ŀ
		String technical = "Java";
		String hobby = "����";
		System.out.print("���ͬѧ�����ǣ�"+name);
		System.out.println("�����ǣ�"+age);
		System.out.println("������"+year+"����");
		System.out.println("����"+projectNum+"����Ŀ");
		System.out.println("����������"+technical);
		System.out.println("��Ȥ�����ǣ�"+hobby);
	}
}
