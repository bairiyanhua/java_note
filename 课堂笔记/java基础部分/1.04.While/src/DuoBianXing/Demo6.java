package DuoBianXing;

public class Demo6 {
	public static void main(String[] args) {
	for (int i = 1; i <= 5; i++) {
		// j:�հ�
		for (int j = 1; j <= 5 - i; j++) {
			System.out.print(" ");
		}
		// j:ÿһ�������ǵĸ���������
		for (int j = 1; j <= 2*i-1; j++) {
			System.out.print(j-1);
		}
		// ÿһ�����������Ϻ�Ҫ����
		System.out.println();
	}
//�ٲ�һ�����еĵ�����
	for (int i= 1; i <= 4; i++) {
	
		for (int j = 1; j <=i ; j++) {
		System.out.print(" ");
	}
	// j:ÿһ�������ǵĸ���������
		for (int j = 1; j <=2*(5-i)-1; j++) {
		System.out.print(j-1);
	}	
	System.out.println();
}
}

}
