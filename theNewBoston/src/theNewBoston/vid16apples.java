package theNewBoston;
import java.util.Scanner;

public class vid16apples {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		tunna tunnaObject=new tunna();
		System.out.println("Enter name of first gf here: ");
		String temp=input.nextLine();
		tunnaObject.setName(temp);
		tunnaObject.saying();

	}

}
