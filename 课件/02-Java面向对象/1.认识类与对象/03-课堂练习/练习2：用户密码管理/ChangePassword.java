import java.util.Scanner;

public class ChangePassword {

	/**
	 * 更改管理员密码
	 */
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
        Administrator admin = new Administrator();	//创建管理员对象
        admin.name = "admin1";						//给name属性赋值
        admin.password = "111111";					//给password属性赋值
        //输入旧的用户名和密码
        System.out.print("请输入用户名:");
        String nameInput = input.next();
        System.out.print("请输入密码:");
        String pwd = input.next();
        //判断用户输入的用户名和密码是否正确
        if(admin.name.equals(nameInput) && admin.password.equals(pwd)){
            System.out.print("\n请输入新密码:");
            admin.password = input.next(); //修改密码
            System.out.println("修改密码成功,您的新密码为:" + admin.password);
        }else{
            System.out.print("用户名和密码不匹配!您没有权限更新管理员信息。");
        }

	}
}
