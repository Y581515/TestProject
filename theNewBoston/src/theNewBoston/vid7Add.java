package theNewBoston;
import java.util.Scanner;

public class vid7Add {

	public static void main(String[] args) {
		Scanner bucky=new Scanner(System.in);
		double fnum, snum, answer;
		System.out.println("enter the first num: ");
		fnum = bucky.nextDouble();
		System.out.println("enter the second num: ");
		snum = bucky.nextDouble();
		answer= fnum + snum;
		System.out.println(answer);
        
	}

}
