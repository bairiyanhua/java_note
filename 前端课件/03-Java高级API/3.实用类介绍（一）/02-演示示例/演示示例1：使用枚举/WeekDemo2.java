/**
 * ö�ٳ����Ķ����ʹ��
 * */
public class WeekDemo2 {
	/**
	 * ��ʲô����
	 * */
	public void doWhat(Week day){
		//ʹ��ö��
		switch(day){
			case MON:
			case TUE:
			case WED:
			case THU:
			case FRI:
				System.out.println("�����գ�Ŭ��д���룡");
				break;
			case SAT:
				System.out.println("����������Ϣ������Ӱ��");
				break;
			case SUN:
				System.out.println("�����գ���Ϣ������Ӱ��");
				break;
			default:
				System.out.println("�����ϵ�һ�����ھ�7��");
		}
	}
	
	public static void main(String[] args){
		WeekDemo2 wd=new WeekDemo2();
		wd.doWhat(Week.FRI);
	}
}
