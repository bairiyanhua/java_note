package com1;

import java.util.Scanner;


public class Player {
	private int levelNum;	//当前等级
	private int jiFen;	//当前积分
	private long startTime;	//开始时间
	private int usedTime;	//已用时间

	 // 玩家玩游戏
	public void play(){
		Scanner input = new Scanner(System.in);
		Game game = new Game(this);
		
		//外层循环代表等级，每循环一次，等级+1
		for (int i = 0; i < LevelParam.levels.length; i++) {
			levelNum++;
			jiFen = 0;
			
			//调用方法时所经过的所有毫秒数
			startTime = System.currentTimeMillis();
			
			//内层循环，代表题目数
			for (int j = 0; j < LevelParam.levels[levelNum-1].getStrTime(); j++) {
				
				//输出字符串
				String out = game.printStr();
				
				//输入字符串
				String in = input.next();
				
				//判断以上两个值是否相等。
				game.printResult(out, in);
				
			}	
		}	
	}

	public int getLevelNo() {
		return levelNum;
	}

	public void setLevelNo(int levelNo) {
		this.levelNum = levelNo;
	}

	public int getCurScore() {
		return jiFen;
	}

	public void setCurScore(int curScore) {
		this.jiFen = curScore;
	}

	public long getStartTime() {
		return startTime;
	}

	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}

	public int getUseTime() {
		return usedTime;
	}

	public void setUseTime(int useTime) {
		this.usedTime = useTime;
	}

}
