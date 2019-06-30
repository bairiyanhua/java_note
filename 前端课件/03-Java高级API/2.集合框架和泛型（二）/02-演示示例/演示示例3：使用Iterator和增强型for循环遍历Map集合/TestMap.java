package cn.jbit.iterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import cn.jbit.epet.poly.Dog;

/**
 * ����ͨ��Iterator����ǿ��forѭ������Map����
 * @author ��������
 */
public class Test5 {
	public static void main(String[] args) {

		/* 1�����������������*/
		Dog ououDog = new Dog("ŷŷ", "ѩ����");
		Dog yayaDog = new Dog("����", "��������");
		Dog meimeiDog = new Dog("����", "ѩ����");
		Dog feifeiDog = new Dog("�Ʒ�", "��������");
		/* 2������Map���϶��󲢰Ѷ�����������������*/
		Map dogMap=new HashMap();
		dogMap.put(ououDog.getName(),ououDog);
		dogMap.put(yayaDog.getName(),yayaDog);
		dogMap.put(meimeiDog.getName(),meimeiDog);
		dogMap.put(feifeiDog.getName(),feifeiDog);
		/*3��ͨ������������������������й�������Ϣ*/
		System.out.println("ʹ��Iterator���������й������ǳƺ�Ʒ�ֱַ��ǣ�");
		Set keys=dogMap.keySet();//ȡ������key�ļ���
		Iterator it=keys.iterator();//��ȡIterator����
		while(it.hasNext()){
			String key=(String)it.next();  //ȡ��key
			Dog dog=(Dog)dogMap.get(key);  //����keyȡ����Ӧ��ֵ
			System.out.println(key+"\t"+dog.getStrain());
		}
		/*//ʹ��foreach���������������й�������Ϣ
		 for(Object key:keys){
			Dog dog=(Dog)dogMap.get(key);  //����keyȡ����Ӧ��ֵ
			System.out.println(key+"\t"+dog.getStrain());	
		}
		*/	
	}
}
