package no.hvl.dat100;
import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class sumOgAreal {

	public static void main(String[] args) {
		String Talltxt1 = showInputDialog("Gi et tall");
		String Talltxt2 = showInputDialog("Gi et tall til");
		String LengdeTxt = showInputDialog("Gi Lengden");
		String BreddeTxt = showInputDialog("Gi Bredden");
		
		int Tall1 = parseInt(Talltxt1);
		int Tall2 = parseInt(Talltxt2);
		int summen = (Tall1+Tall2);
	
		int Lengde = parseInt(LengdeTxt);
		int Bredde = parseInt(BreddeTxt);
		int Areal = (Lengde*Bredde);
		
		showMessageDialog(null, Tall1 +" + "+ Tall2 + " = " + summen );
		showMessageDialog(null, "Areal = "  + Areal );
	
	}

}
