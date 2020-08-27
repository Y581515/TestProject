package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class HourMinuteSecond {

	public static void main(String[] args) {
		String sekundTxt = showInputDialog("sett in antall sekunder");
		int sekundTall = parseInt(sekundTxt);
		int timeTall = (sekundTall/3600);
		int minutTall=(sekundTall-(timeTall*3600))/60;
		int sekundTallet=(sekundTall-(timeTall*3600)-(minutTall*60));
		
		
		showMessageDialog(null,timeTall+" timer, "+minutTall + " minutter, "+ sekundTallet+"sekunder");

	}

}
