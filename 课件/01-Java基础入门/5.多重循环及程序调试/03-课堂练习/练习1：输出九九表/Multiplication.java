/*
 * ��ӡ9*9�˷���
 */
public class Multiplication {

	public static void main(String[] args) {
	    int i, j;  // ѭ������
        for (i = 1; i <= 9; i++){  // ���ѭ�����Ʊ�����        
            for (j = 1; j <= i; j++){  // �ڲ�ѭ�����Ƴ���            
            	System.out.print(i+"*"+j+"="+(i*j)+"\t");                
            }
            System.out.println();  // ��ӡһ�к���           
        }
	}
}
