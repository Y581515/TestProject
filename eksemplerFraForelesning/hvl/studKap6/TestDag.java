package hvl.studKap6;

public class TestDag {

	public static void main(String[] args) {
		for( Dag d: Dag.values()) {
			System.out.print(d+" ");
		}System.out.println();
		System.out.println();
		
		Dag d1=Dag.MANDAG;
		System.out.println("d1= "+d1);
		System.out.println("d1 Indeks = "+d1.ordinal()+"\n");
		
		String svar="";
		switch(d1) {
		case LØRDAG: 
			svar="Lørdagsrute: bussen kommer hver halv time. ";
			break;
		case SØNDAG: 
			svar="Søndagsrute: bussen kommer hver time.";
			break;
		default:
			svar="Vanlig vekedag";
		}
		System.out.println(svar);
		
	}

}
