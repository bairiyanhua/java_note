import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CarDutil {
	
	public void read(){
		
		FileReader fr;
		BufferedReader br;
		try{
			fr=new FileReader("套餐资费说明.txt");
		br=new BufferedReader(fr);
		String str=br.readLine();
		while(str!=null){
			System.out.println(str);
			str=br.readLine();
		}

		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
	}
}
}