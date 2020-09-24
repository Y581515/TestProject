package hvl.stud;

public class sokningV2 {

	public static void main(String[] args) {
		double a=-5;
		double obs[]= {1.2,-3.5,4.8,7.9,41.2,10.1};
		System.out.println(finnesOver(obs, a));
		System.out.println(antallOver(obs, a));
	}
	private static boolean finnesOver(double tab[], double grense) {
		boolean funnet=false;
		int i=0;
		for(double v:tab) {
			if(v>grense) {
			funnet=true;
			}
		}
		return funnet;
	}
	private static int antallOver(double tab[], double grense) {
		
		int antall=0;
		for (double v:tab) {
			if (v>grense) {
				antall++;
			}
		}
		return antall;
	}

}
