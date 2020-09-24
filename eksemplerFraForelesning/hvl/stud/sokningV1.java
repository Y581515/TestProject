package hvl.stud;

public class sokningV1 {

	public static void main(String[] args) {
		double a=-5;
		double obs[]= {1.2,-3.5,4.8,7.9,41.2,10.1};
		System.out.println(finnesOver(obs, a));
		System.out.println(antallOver(obs, a));
	}
	private static boolean finnesOver(double tab[], double grense) {
		boolean funnet=false;
		int i=0;
		while (i <tab.length && (!funnet)) {
			if (tab[i]>=grense) {
				funnet=true;
			}i++;
		}
		return funnet;
	}
	private static int antallOver(double tab[], double grense) {
		
		int antall=0;
		for (int i=0; i <tab.length;i++) {
			if (tab[i]>grense) {
				antall++;
			}
		}
		return antall;
	}

}
