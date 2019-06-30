package cn.kgc;

/*
 * 编写Java程序，实现输出1~100中所有不能被7整除的数，并求其和。当累加和大于4000时，记录当前数，跳出循环。
要求：每输出4个数换行显示。
 * */
public class Test {
	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		for(int num = 1;num<100;num++){
			if(num%7!=0){
				System.out.print(num+"\t");
				i++;
				if(i==4){
					System.out.println();
					i=0;
				}
				sum += num;
				if(sum>4000){
					System.out.println("\n当前数："+num);
					break;
				}
			}
		}
		System.out.println("总和："+sum);
	}

}
