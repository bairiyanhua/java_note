package staticDemo;

/*
 * 一群选民进行投票，每个选民只允许投一次票，并且当投票总数达到100时，就停止投票
 * Voter：选民类
 * */
public class Voter {
	private static int count; // 所有选民都会改变同一个数据：投票次数
	private static final int MAX_COUNT = 100; // 最大投票数100适用于所有选民
	private String name;// 投票人姓名

	public Voter(String name) {
		this.name = name;
	}

	//投票
	public void voteFor() {
		if(count==MAX_COUNT){
			System.out.println("投票活动已经结束");
			return;
		}else{
			count++;
			System.out.println(this.name + "：感谢您投票！");
		}
	}
	
	//打印投票结果
	public static void printResult(){
		System.out.println("选民投票总数为："+count);
		//无法访问实例变量
		//System.out.println(name);
	}
	
}
