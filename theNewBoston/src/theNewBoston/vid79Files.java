package theNewBoston;
import java.util.*;

public class vid79Files {
	public static void main(String[] args) {
		
		final Formatter x;
		try {
			x= new Formatter("fred.txt");
			System.out.println("you created a file");
		}
		catch(Exception e) {
			System.out.println("you got an error");
		}

	}

}
