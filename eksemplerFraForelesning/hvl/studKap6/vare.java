package hvl.studKap6;

public class vare {
	private int nr;
	private String navn;
	private double pris;
	private int antall;
	
	public int getNr() {
		return nr;
	}
	public String getNavn() {
		return navn;
	}
	public double getPris() {
		return pris;
	}
	public int getAnatall() {
		return antall;
	}
	
	
	public void settNr(int nr) {
		this.nr=nr;		
	}
	public void settNavn(String navn) {
		this.navn=navn;
	}
	public void settPris(double pris) {
		this.pris=pris;		
	}
	public void settAntall(int antall) {
		this.antall=antall;		
	}
	
	
	
	
	
	
	public vare() {
	}
	
	public vare(int nr, String navn, double pris, int antall) {
		this.nr=nr;
		this.navn=navn;
		this.pris=pris;
		this.antall=antall;
	}
	
	public vare(int nr, String navn, double pris) {
		this.nr=nr;
		this.navn=navn;
		this.pris=pris;
		this.antall=0;
	}
	
	public vare(int nr, String navn) {
		this(nr, navn, 0, 0);
	}
	
	public void skriveUt() {
		System.out.println("nr= "+nr+", navn= "+navn+", pris= "+pris+", antall= "+antall);
	}
	public String toString() {
		return nr+" "+navn+" "+pris+" "+antall;
	}
	
	

}
