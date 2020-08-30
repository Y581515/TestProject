package hvl.stud;
import static javax.swing.JOptionPane.*;

public class Skop {

	public static void main(String[] args) {
		
		int mnd=0;
		do{
			mnd=Integer.parseInt(showInputDialog("månadsnummr: "));
		}while (mnd < 1 || mnd > 12);
		System.out.println(mnd);
	}

}
