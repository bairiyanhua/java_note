package staticDemo;

/*
 * һȺѡ�����ͶƱ��ÿ��ѡ��ֻ����Ͷһ��Ʊ�����ҵ�ͶƱ�����ﵽ100ʱ����ֹͣͶƱ
 * Voter��ѡ����
 * */
public class Voter {
	private static int count; // ����ѡ�񶼻�ı�ͬһ�����ݣ�ͶƱ����
	private static final int MAX_COUNT = 100; // ���ͶƱ��100����������ѡ��
	private String name;// ͶƱ������

	public Voter(String name) {
		this.name = name;
	}

	//ͶƱ
	public void voteFor() {
		if(count==MAX_COUNT){
			System.out.println("ͶƱ��Ѿ�����");
			return;
		}else{
			count++;
			System.out.println(this.name + "����л��ͶƱ��");
		}
	}
	
	//��ӡͶƱ���
	public static void printResult(){
		System.out.println("ѡ��ͶƱ����Ϊ��"+count);
		//�޷�����ʵ������
		//System.out.println(name);
	}
	
}
