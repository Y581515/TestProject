package hvl.studKap6;

public class vareMainmetoden {

	public static void main(String[] args) {
		vare v1= new vare();
		v1.settNr(1);
		v1.settNavn("potet");
		v1.settPris(6.9);
		v1.settAntall(420);
		v1.skriveUt();
		
		
		
		vare v2= new vare(2, "tomat", 6.9, 420);
		v2.skriveUt();
		System.out.println(v2.getNr());
		
		vare v3=new vare(3, "løk", 6.9);
		v3.skriveUt();
		
		vare v4=new vare(4, "løk");
		v4.skriveUt();
		
	

	}

}
