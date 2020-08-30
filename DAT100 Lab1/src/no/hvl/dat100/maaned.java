package no.hvl.dat100;

public class maaned {

	public static void main(String[] args) {
		int dag = 5;
		int mnd = 4;
		int aar=2020;
		
		//07.05.2020
		String resultat = "";
		
		if (dag < 10){
			resultat =resultat + "0";
		}
		resultat = resultat + dag + ".";
		if (mnd < 10){
			resultat =resultat + "0";
			}
		resultat =resultat + mnd+".";
			
		resultat =resultat + aar;
		
		System.out.println(resultat);
		
		

	}

}
