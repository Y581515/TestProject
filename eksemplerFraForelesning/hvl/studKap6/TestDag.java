package hvl.studKap6;

public class TestDag {

	public static void main(String[] args) {
		for( Dag d: Dag.values()) {
			System.out.print(d+" ");
		}System.out.println();
		System.out.println();
		
		Dag d1=Dag.L�RDAG;
		System.out.println("d1= "+d1);
		System.out.println("d1 Indeks = "+d1.ordinal()+"\n");
		
		String svar="Vanlig vekedag";
		switch(d1) {
		case L�RDAG: 
			svar="L�rdagsrute: ";
			break;
		case S�NDAG: 
			svar="S�ndagsrute: ";
			break;
		default:
		}
		System.out.println(svar);
		
	}

}
