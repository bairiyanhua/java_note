package cn.com.jbit;

public class Demo {
	public static void main(String[] args) {
		//���а�װ�඼�ɽ���֮��Ӧ�Ļ�������������Ϊ���������������ǵ�ʵ��
		Integer i=new Integer(34);
		Double d=new Double(98.7);
		Boolean b=new Boolean(true);
		Character c=new Character('a');
		System.out.println(i+"\t"+d+"\t"+b+"\t"+c);
		
		//��Character���⣬������װ�����һ���ַ���Ϊ�����������ǵ�ʵ��
		//�������
		//Character c2=new Character("a");
		Integer i2=new Integer("34");
		Double d2=new Double("98.7");
		Boolean b2=new Boolean("true");
		System.out.println(i2+"\t"+d2+"\t"+b2);
		
		//Boolean�๹�췽������ΪString����ʱ�������ַ�������Ϊtrue(�����Ǵ�Сд)�����Boolean�����ʾtrue�������ʾfalse
		Boolean b3=new Boolean("TRue");
		Boolean b4=new Boolean("false");
		Boolean b5=new Boolean("love");
		System.out.println(b3+"\t"+b4+"\t"+b5);
		
		//����װ�๹�췽������ΪString ����ʱ���ַ�������Ϊnull���Ҹ��ַ�������ɽ���Ϊ��Ӧ�Ļ����������͵����ݣ��������ͨ��������ʱNumberFormatException�쳣
		Integer i3=new Integer(null);
		Double d4=new Double("��װ��");
		System.out.println(i3+"\t"+d4);
	}
}
