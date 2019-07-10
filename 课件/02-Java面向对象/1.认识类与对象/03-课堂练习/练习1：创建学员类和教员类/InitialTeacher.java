public class InitialTeacher {
	public static void main(String[] args) {
		Teacher teacher = new Teacher();	//创建对象
		teacher.name = "王老师";				//给各个属性赋值
		teacher.major = "计算机";
		teacher.courses = "使用Java语言理解程序逻辑";
		teacher.schoolAge = 5;
		teacher.show();						//调用方法
	}
}
