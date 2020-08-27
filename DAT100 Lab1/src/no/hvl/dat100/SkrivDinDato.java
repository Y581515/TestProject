package no.hvl.dat100;
import static javax.swing.JOptionPane.*;

public class SkrivDinDato {

	public static void main(String[] args) {
		String dagTxt=showInputDialog("hvilken dag var du født");
		String månadTxt=showInputDialog("hvilken månad");
		String årTxt=showInputDialog("hvilken år");
		
		showMessageDialog(null,"din fødseles dato er  "+dagTxt+"."+månadTxt+"."+årTxt);

	}

}
