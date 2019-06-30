public class School {
	String schoolName;		//中心名称
	int classNumber;		//教室数目
	int labNumber;			//机房数目
	
	//定义北大青鸟中心的方法
	public void showCenter(){
		System.out.println(schoolName + "培训学员\n" + "配备：" 
			+ classNumber + "教" + labNumber + "机");
	}
}
