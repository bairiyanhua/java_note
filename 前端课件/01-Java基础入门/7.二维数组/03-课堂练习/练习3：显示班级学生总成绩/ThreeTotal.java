import java.util.Scanner;

/**
 * 已知有3个班级各5名学员，请使用二维数组计算各个班级的总成绩
 * */
public class ThreeTotal {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int [][] array = new int[3][5]; //3个班的成绩
		//i:班级  j:各班级的学生
		for(int i=0;i<array.length;i++){
			System.out.println("**********第"+(i+1)+"个班**********");
			for(int j=0;j< array[i].length;j++){
				System.out.print("请输入第"+(j+1)+"个学生的成绩:");
				array[i][j]=input.nextInt();
				
			}
		}
		System.out.println("***********成绩统计************");
		int total; //保存总成绩
		for(int i = 0; i < array.length; i++) {
	        String str = (i+1) + "班";
	        total = 0; //每次循环到此都将其归0
	        for(int j = 0; j < array[i].length; j++) {
	        	total += array[i][j]; //成绩叠加
	        }
	        System.out.println(str+"总成绩：" + total);
		}
	}
}
