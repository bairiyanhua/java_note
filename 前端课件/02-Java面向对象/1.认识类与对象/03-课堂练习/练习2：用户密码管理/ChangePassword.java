import java.util.Scanner;

public class ChangePassword {

	/**
	 * ���Ĺ���Ա����
	 */
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
        Administrator admin = new Administrator();	//��������Ա����
        admin.name = "admin1";						//��name���Ը�ֵ
        admin.password = "111111";					//��password���Ը�ֵ
        //����ɵ��û���������
        System.out.print("�������û���:");
        String nameInput = input.next();
        System.out.print("����������:");
        String pwd = input.next();
        //�ж��û�������û����������Ƿ���ȷ
        if(admin.name.equals(nameInput) && admin.password.equals(pwd)){
            System.out.print("\n������������:");
            admin.password = input.next(); //�޸�����
            System.out.println("�޸�����ɹ�,����������Ϊ:" + admin.password);
        }else{
            System.out.print("�û��������벻ƥ��!��û��Ȩ�޸��¹���Ա��Ϣ��");
        }

	}
}
