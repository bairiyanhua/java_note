public class Teacher {
	String name;	//姓名
	String major;	//专业方向
	String courses;	//教授课程
	int schoolAge;	//教龄
	
	//输出信息方法
	public void show(){
		System.out.println(name + "\n专业方向：" + major + 
			"\n教授课程：" + courses + "\n教龄：" + schoolAge);
	}
}
