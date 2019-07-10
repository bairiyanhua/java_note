package com.kgc.exam;

import java.util.Random;

/**
 * 游戏类
 * @author Administrator
 *
 */
public class Game {
	
	private Player player;
	
	public Game(Player player) {
		this.player = player;
	}

	/**
	 * 输出指定级别规定长的字符串
	 * 输出的字符串用于和玩家输入的字符串做对比
	 * @return
	 */
	public String printStr(){
		//获取要输出的字符串长度
		int length = LevelParam.levels[player.getLevelNo()-1].getStrLength();
		
		//使用StringBuffer拼接字符串
		StringBuffer sb = new StringBuffer();
		//通过随机数取出每次要拼接的字符
		Random random = new Random();
		for (int i = 0; i < length; i++) {
			int key = random.nextInt(length);
			switch (key) {
			case 0:
				sb.append("<");
				break;
			case 1:
				sb.append(">");
				break;
			case 2:
				sb.append("*");
				break;
			case 3:
				sb.append("&");
				break;
			case 4:
				sb.append("#");
				break;
			case 5:
				sb.append("$");
				break;
			case 6:
				sb.append("@");
				break;
			}
		}
		System.out.println(sb.toString());
		return sb.toString();
	}
	
	public void printResult(String out, String in){
		if(out.equals(in)){ //判断输入输出是否一致，如果相同继续，如果不相同，给提示，退出
			long time = System.currentTimeMillis();
			//输入相同，判断有没有超时
			//当前时间-开始时间 得到已用的毫秒/1000和规定的时间对比
			if((time-player.getStartTime())/1000 < LevelParam.levels[player.getLevelNo()-1].getTimeLimit()){
				//设置积分
				player.setCurrScore(player.getCurrScore() + LevelParam.levels[player.getLevelNo()-1].getPerScore());
				//设置时间
				player.setUseTime((int)(time-player.getStartTime())/1000);
				System.out.println("输入正确，您的级别"+player.getLevelNo()+" ,您的积分"+player.getCurrScore()+",已用时间"+player.getUseTime()+"秒。");
				
				if(player.getLevelNo() == LevelParam.levels.length){ //判断是否是正常退出
					int score = LevelParam.levels[player.getLevelNo()-1].getStrTimes() * LevelParam.levels[player.getLevelNo()-1].getPerScore();
					if(score == player.getCurrScore()){
						System.out.println("您已闯关成功，成为绝世高手，恭喜您！！！");
						System.exit(0);
					}
				}
				
			}else{ //如果超时，退出
				System.out.println("您输入太慢了，已经超时，退出！");
				System.exit(1);
			}
		}else{ //输入输出不相同
			System.out.println("输入错误");
			System.exit(1);
		}
		
		
	}
	

}
