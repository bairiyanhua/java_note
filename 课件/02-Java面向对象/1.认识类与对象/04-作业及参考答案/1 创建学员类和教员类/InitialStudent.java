public class InitialStudent {
	public static void main(String args[]){
		Student student = new Student();	//创建对象
		student.name = "张浩";				//给各个属性赋值
		student.age = 10;
		student.classNo = "S1班";
		student.hobby = "篮球";
		student.show();						//调用方法
	}
}
