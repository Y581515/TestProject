package no.hvl.dat100;
import static javax.swing.JOptionPane.*;

public class SkrivDinDato {

	public static void main(String[] args) {
		String dagTxt=showInputDialog("hvilken dag var du f�dt");
		String m�nadTxt=showInputDialog("hvilken m�nad");
		String �rTxt=showInputDialog("hvilken �r");
		
		showMessageDialog(null,"din f�dseles dato er  "+dagTxt+"."+m�nadTxt+"."+�rTxt);

	}

}
