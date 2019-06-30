package staticDemo;

public class TestVoter {
	public static void main(String[] args) {
		Voter zhang=new Voter("张三");
		Voter li=new Voter("李四");
		Voter wang=new Voter("王五");
		
		Voter.printResult();
		
		zhang.voteFor();
		li.voteFor();
		wang.voteFor();
		
		Voter.printResult();
		
		for(int i=1;i<=97;i++){
			Voter v=new Voter("v"+i);
			v.voteFor();
		}
		
		Voter v101=new Voter("v101");
		v101.voteFor();
		
		Voter.printResult();
	}
}
