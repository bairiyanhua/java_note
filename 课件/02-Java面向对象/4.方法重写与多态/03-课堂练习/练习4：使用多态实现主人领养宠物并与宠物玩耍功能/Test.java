package cn.jbit.epet.poly4;

import java.util.Scanner;

/**
 * �����࣬�������ﲢιʳ��
 */
public class Test {
	public static void main(String[] args) {
		 Master master=new Master("������",100);
		 Scanner input = new Scanner(System.in);
		 System.out.println("��ӭ����������꣡");
		 System.out.print("��ѡ��Ҫ�����ĳ������ͣ���1������ 2����죩");
		 int typeId=input.nextInt();
		 Pet pet=master.getPet(typeId);
		 if(pet!=null){
			 System.out.println("�����ɹ���");
			 //pet.setHealth(80);  //���ý���ֵ���Ա�����ιʳ
			 master.feed(pet);
			 master.play(pet);
		 }else{
			 System.out.println("�Բ���û�д����͵ĳ������ʧ��");
		 }
   }
}
