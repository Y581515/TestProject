package no.hvl.dat100;

public class maaned {

	public static void main(String[] args) {
		int dag = 7;
		int mnd = 5;
		int aar=2020;
		
		//07.05.2020
		String resultat = "";
		
		if (dag < 10){
			resultat +="0";
		}
		resultat +=dag + ".";
		if (mnd < 10){
			resultat +="0";
			}
		resultat +=mnd+".";
			
		resultat +=aar;
		
		System.out.println(resultat);
		
		

	}

}
