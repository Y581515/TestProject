package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.Double.*;


public class minAv4Talllene {

	public static void main(String[] args) {
		String TallTxt1=showInputDialog("Gi et tall");
		String TallTxt2=showInputDialog("Gi et tall til");
		String TallTxt3=showInputDialog("Gi et tall til ");
		String TallTxt4=showInputDialog("Gi et tall til");
		
		Double Tall1 = parseDouble(TallTxt1);
		Double Tall2 = parseDouble(TallTxt2);
		Double Tall3 = parseDouble(TallTxt3);
		Double Tall4 = parseDouble(TallTxt4);
		
		double minst1= Math.min(Tall1,Tall2);
		double minst2= Math.min(Tall3,Tall4);
		double minst= Math.min(minst1,minst2);
		
		showMessageDialog(null, "den ministe tallet fra de 4 tallene du satt in er "+ minst);
		

	}

}
