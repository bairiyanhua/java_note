
public class WeekDemo1 {
	/**
	 * ��ʲô����
	 * */
	public void doWhat(int day){
		//ʹ�������ж�
		if(day>7 || day<1){
			System.out.println("��������Ӧ��1-7֮��");
			return;
		}
		switch(day){
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				System.out.println("�����գ�Ŭ��д���룡");
				break;
			case 6:
				System.out.println("����������Ϣ������Ӱ��");
				break;
			case 7:
				System.out.println("�����գ���Ϣ������Ӱ��");
				break;
			default:
				System.out.println("�����ϵ�һ�����ھ�7��");
		}
	}
	
	public static void main(String[] args){
		WeekDemo1 wd=new WeekDemo1();
		wd.doWhat(5);
		wd.doWhat(10);
	}
}
