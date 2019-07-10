package cn.jbit.ifdemo;

public class Compete2 {
	public static void main(String[] args) {
		int mingCi = 1;  //名次
        switch (mingCi){
            case 1:
                System.out.println("参观麻省理工大学计算机学院组织1个月夏令营");
                break;
            case 2:
                System.out.println("奖励hp笔记本一部");
                break;
            case 3:
                System.out.println("奖励移动硬盘一部");
                break;
            default:
                System.out.println("没有任何奖励");
        }
	}
}
