package cn.jbit.ifdemo;

public class Compete {

	public static void main(String[] args) {

		int mingCi = 3;    //名次
        if (mingCi == 1) {
            System.out.println("参加麻省理工大学计算机学院组织1个月夏令营");
        } else if (mingCi == 2) {
            System.out.println("奖励hp笔记本一部");
        } else if (mingCi == 3) {
            System.out.println("奖励移动硬盘一部");
        } else {
            System.out.println("没有任何奖励");
        }

	}

}
