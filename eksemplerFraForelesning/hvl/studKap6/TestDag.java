package hvl.studKap6;

public class TestDag {

	public static void main(String[] args) {
		for( Dag d: Dag.values()) {
			System.out.print(d+" ");
		}System.out.println();
		System.out.println();
		
		Dag d1=Dag.LØRDAG;
		System.out.println("d1= "+d1);
		System.out.println("d1 Indeks = "+d1.ordinal()+"\n");
		
		String svar="Vanlig vekedag";
		switch(d1) {
		case LØRDAG: 
			svar="Lørdagsrute: ";
			break;
		case SØNDAG: 
			svar="Søndagsrute: ";
			break;
		default:
		}
		System.out.println(svar);
		
	}

}
