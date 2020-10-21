package theNewBoston;
import java.io.*;

public class vid78Files {

	public static void main(String[] args) {

		File x=new File("C:\\Users\\yfess\\Desktop\\greg.txt");
		
		if(x.exists()) {
			System.out.println(x.getName()+" exist");
		}else {
			System.out.println("this file doesn't exist");
		}
		
	}

}
