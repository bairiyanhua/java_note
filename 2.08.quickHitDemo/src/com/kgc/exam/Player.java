package com.kgc.exam;

import java.util.Scanner;

/**
 * 玩家类
 * @author Administrator
 *
 */
public class Player {
	
	private int levelNo; //玩家当前级别号（levelNo）
	private int currScore; //玩家当前级别积分（currScore）
	private long startTime; //当前级别开始时间（startTime）
	private int useTime; //当前级别已用时间（useTime）
	
	public void play(){
		Scanner input = new Scanner(System.in);
		Game game = new Game(this);
		//外层循环控制等级
		for (int i = 0; i < LevelParam.levels.length; i++) {
			
			levelNo++; //等级+1
			currScore = 0;	//积分清0
			startTime = System.currentTimeMillis();	//重新开始计时间
			
			//内层循环控制每个等级有多少题
			//循环一次完成一次字符串的输出、输入、比较
			for (int j = 0; j < LevelParam.levels[i].getStrTimes(); j++) {
				//调用Game里方法，打印出要输入的字符串
				String out = game.printStr();
				
				String in = input.next();
				
				game.printResult(out, in);
			}
			
		}
	}
	
	
	
	
	
	
	
	
	
	public int getLevelNo() {
		return levelNo;
	}
	public void setLevelNo(int levelNo) {
		this.levelNo = levelNo;
	}
	public int getCurrScore() {
		return currScore;
	}
	public void setCurrScore(int currScore) {
		this.currScore = currScore;
	}
	public long getStartTime() {
		return startTime;
	}
	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}
	public int getUseTime() {
		return useTime;
	}
	public void setUseTime(int useTime) {
		this.useTime = useTime;
	}
	

}
