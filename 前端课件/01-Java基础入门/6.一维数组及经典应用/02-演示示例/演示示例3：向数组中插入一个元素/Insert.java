import java.util.*;

public class Insert {

	public static void main(String[] args) {
		int[] list = new int[6]; // ����ΪΪ6������
		list[0] = 99;
		list[1] = 85;
		list[2] = 82;
		list[3] = 63;
		list[4] = 60;

		int index = list.length; // ���������ɼ�����λ��
		System.out.println("�����������ɼ��� ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt(); // ����Ҫ���������
		// �ҵ���Ԫ�صĲ���λ��
		for (int i = 0; i < list.length; i++) {
			if (num > list[i]) {
				index = i;
				break;
			}
		}
		// Ԫ�غ���
		for (int j = list.length - 1; j > index; j--) {
			list[j] = list[j - 1]; // index�±꿪ʼ��Ԫ�غ���һ��λ��
		}
		list[index] = num;// ��������
		System.out.println("����ɼ����±��ǣ�" + index);
		System.out.println("�����ĳɼ���Ϣ�ǣ� ");
		for (int k = 0; k < list.length; k++) { // ѭ�����Ŀǰ�����е�����
			System.out.print(list[k] + "\t");
		}

	}

}
