

import java.util.ArrayList;
import java.util.List;

import cn.jbit.epet.poly.Dog;

/**
 * ���Զ�ListӦ�÷��͡�
 * @author ��������
 */
public class TestList {
    public static void main(String[] args) {
        /* 1�����������������*/
        Dog ououDog = new Dog("ŷŷ", "ѩ����");
		Dog yayaDog = new Dog("����", "��������");
		Dog meimeiDog = new Dog("����", "ѩ����");
		Dog feifeiDog = new Dog("�Ʒ�", "��������");
        /* 2������ArrayList���϶��󲢰Ѷ�����������������*/
        List<Dog> dogs = new ArrayList<Dog>();//���Ԫ������
        dogs.add(ououDog);
	    dogs.add(yayaDog);
	    dogs.add(meimeiDog);
	    dogs.add(2, feifeiDog); // ���feifeiDog��ָ��λ��
	    //dogs.add("hello"); //���ֱ������,Ԫ�����Ͳ���Dog��
        /* 3�� ��ʾ������Ԫ�ص���Ϣ*/
        Dog dog3 = dogs.get(2); //��������ǿ��ת��
        System.out.println("��������������Ϣ����:");
        System.out.println(dog3.getName() + "\t" + dog3.getStrain());
        /*4��ʹ��foreach������dogs����*/
		System.out.println("\n���й�������Ϣ���£�");
		for(Dog dog:dogs){//��������ǿ��ת��
			System.out.println(dog.getName() + "\t" + dog.getStrain());
		}   
    }
}
