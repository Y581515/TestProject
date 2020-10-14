package hvl.studKap7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import hvl.studKap6.vare;

public class VareLagerkap7 {

	public static void main(String[] args) throws Exception {
		//hva er final int;
		final int MAX_ANT=100;
		vare[] vareListe= new vare [MAX_ANT];
		
		String filnavn= "varedata.txt";
		File fil=new File(filnavn);
		Scanner leser=new Scanner(fil);
		
		//Fjern overskrift, kan evt sjekke om filen ikkje er tom
		String linje=leser.nextLine();
		
		int antVarer=0;
		while(antVarer<MAX_ANT && leser.hasNextLine()) {
			//les linje fra filen
			linje=leser.nextLine();
			
			//del opp linja
			String[] vareTab = linje.split(";");
			
			//lag vare objekt
			int nr=Integer.parseInt(vareTab[0]);
			String navn=vareTab[1];
			double pris=Double.parseDouble(vareTab[2]);
			int antall=Integer.parseInt(vareTab[3]);		
			
			//leg inn i tabell
			vareListe[antVarer]= new vare(nr,navn,pris,antall);
			antVarer++;		
				
		}leser.close();
		
		for(int i=0; i<antVarer;i++) {
			System.out.println(vareListe[i]);
		}
		
		
				
	}

}
