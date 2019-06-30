import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
	public static void main(String[] args) {
		//��������
		List<String> list = new ArrayList<String>();
		//����10����ͬ����
		list.add("this");
		list.add("is");
		list.add("collection");
		list.add("test");
		list.add("and");
		list.add("we");
		list.add("can");
		list.add("learn");
		list.add("how");
		list.add("to");
		
		//��ӡ������������Ԫ�غ���СԪ��   
		String strMax = (String) Collections.max(list);
		String strMin = (String) Collections.min(list);
		System.out.println("���ֵ��"+strMax);
		System.out.println("��Сֵ��"+strMin);
		//�������ӡ�������������Ԫ��   
		Collections.sort(list);
		System.out.println("��������");
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		System.out.println(Collections.binarySearch(list, "this"));
		//�������ӡ�������������Ԫ��
		Collections.reverse(list);
		System.out.println("���Ͻ���");
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}

	}

}
