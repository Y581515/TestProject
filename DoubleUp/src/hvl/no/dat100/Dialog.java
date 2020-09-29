package hvl.no.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;


public class Dialog {

	public static void main(String[] args) {
		String tallTxt = showInputDialog("Gi et tall");
		int tall = parseInt(tallTxt);
		int dobbel = tall*2*1;
		String UtTxt = "svar: "+ dobbel;
		showMessageDialog(null,UtTxt);
	}

}
