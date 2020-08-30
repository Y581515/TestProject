package hvl.stud;
import static javax.swing.JOptionPane.*;

public class alder_Pris {

	public static void main(String[] args) {
		double pris=100;
		int alder=Integer.parseInt(showInputDialog("Alder"));
		
		if(alder <= 5){
			pris=0.0;
		}
		else if (alder <= 12 || alder>=60){
			pris=pris/2;
		}
		showMessageDialog(null,"Pris: "+ pris);
		System.out.println(alder+"år gammel skal betale "+pris+"kroner");
	}
}
