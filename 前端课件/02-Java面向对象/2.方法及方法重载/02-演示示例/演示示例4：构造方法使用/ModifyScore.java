package structMehtod;
public class ModifyScore {
	//修改学员成绩，少于60的提高2分
	public void modifyScore(Student[] stus){
		for(int i=0;i<stus.length;i++){
			if(stus[i].score<60){
				stus[i].score+=2;
			}
		}
	}
	
	//输出学员信息
	public void showInfo(Student[] stus){
		for(Student stu:stus){
			stu.showInfo();
		}
	}

	public static void main(String[] args) {
		ModifyScore ms=new ModifyScore();
		/*Student[] stus=new Student[3];
		Student s1=new Student();
		s1.name="张三";
		s1.score=40;
		Student s2=new Student();
		s2.name="李四";
		s2.score=90;
		Student s3=new Student();
		s3.name="王五";
		s3.score=43;
		stus[0]=s1;
		stus[1]=s2;
		stus[2]=s3;*/
		Student[] stus=new Student[]{new Student("张三",40),new Student("李四",90),new Student("王五",43)};
		
		ms.modifyScore(stus);
		ms.showInfo(stus);
	}

}
