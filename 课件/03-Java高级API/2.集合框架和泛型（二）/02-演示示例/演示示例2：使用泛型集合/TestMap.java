

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import cn.jbit.epet.poly.Dog;

/**
 * ���Զ�MapӦ�÷��͡�
 * @author ��������
 *
 */
public class TestMap {
	public static void main(String[] args) {
		/* 1�����������������*/
		Dog ououDog = new Dog("ŷŷ", "ѩ����");
		Dog yayaDog = new Dog("����", "��������");
		Dog meimeiDog = new Dog("����", "ѩ����");
		Dog feifeiDog = new Dog("�Ʒ�", "��������");
		/* 2������Map���϶��󲢰Ѷ�����������������*/
		Map<String,Dog> dogMap=new HashMap<String,Dog>();
		dogMap.put(ououDog.getName(),ououDog);
		dogMap.put(yayaDog.getName(),yayaDog);
		dogMap.put(meimeiDog.getName(),meimeiDog);
		dogMap.put(feifeiDog.getName(),feifeiDog);
		/*3��ͨ������������������������й�������Ϣ*/
		System.out.println("ʹ��Iterator���������й������ǳƺ�Ʒ�ֱַ��ǣ�");
		Set<String> keys=dogMap.keySet();//ȡ������key�ļ���
		Iterator<String> it=keys.iterator();//��ȡIterator����
		while(it.hasNext()){
			String key=it.next();  //ȡ��key
			Dog dog=dogMap.get(key);  //����keyȡ����Ӧ��ֵ
			System.out.println(key+"\t"+dog.getStrain());
		}
		/*//ʹ��foreach���������������й�������Ϣ
		 for(String key:keys){
			Dog dog=dogMap.get(key);  //����keyȡ����Ӧ��ֵ
			System.out.println(key+"\t"+dog.getStrain());	
		}*/		
	}
}
