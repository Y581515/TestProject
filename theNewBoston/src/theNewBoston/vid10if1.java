package theNewBoston;
import java.util.Scanner;

public class vid10if1 {

	public static void main(String[] args) {
		Scanner bucky=new Scanner(System.in);
		int test=bucky.nextInt();
		
		if (test < 9){
			System.out.println("yes");
		}else {
			System.out.println("its bigger than 9");		
		}
	}

}
