
public class Test {
	// ����ö��
	public enum Level {
		L1,L2,L3
	}

	public void show(Level level) {
		switch (level) {
		case L1:
			System.out.println("�����ݿ�������ʦ");
			break;
		case L2:
			System.out.println("�������ھ򹤳�ʦ");
			break;
		case L3:
			System.out.println("�����ݼܹ�ʦ");
			break;
		default:
			System.out.println("�����д�");
		}
	}
	public static void main(String[] args) {
		Test t = new Test();
		t.show(Level.L1);
		Level level = Level.U2;
		t.show(level);
		t.show(Level.L3);
	}
}
