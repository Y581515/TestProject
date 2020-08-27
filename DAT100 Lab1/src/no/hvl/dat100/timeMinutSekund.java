package no.hvl.dat100;
import static javax.swing.JOptionPane.*;

public class timeMinutSekund {

	public static void main(String[] args) {
		String sekundstreng=showInputDialog("Antall sekund? ");
		int sekunder = Integer.parseInt(sekundstreng);
		
		// a / b = c
		// 7 / 4 = 1 og rest 3  ->  %
		
		int timer = sekunder/3600 ;
		int restSekunder = sekunder % 3600 ;
		
		int minutter = restSekunder / 60;
		int sek = restSekunder % 60;
		
		String resultat = "tekst"+timer;
			if (timer ==1) {
				resultat = resultat + "time, ";
			} else {
				resultat = resultat + "timer, ";
	        }
			
			resultat+=minutter+"minutter, "+ sek+"sekunder" ;
		
		showMessageDialog(null,resultat);

	}

}
