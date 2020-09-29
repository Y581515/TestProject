package hvl.studKap6;

public class Student {
	
	private int studentnr;
	private String fornavn;
	private String etternavn;
	
	public Student(int studentnr, String fornavn,String etternavn ) {
		this.studentnr=studentnr;
		this.fornavn=fornavn;
		this.etternavn=etternavn;
	}

	public int getNr() {
		return studentnr;
	}
	public String getFn() {
		return fornavn;
	}
	public String getEn() {
		return etternavn;
	}
	
	public void skriveUt() {
		System.out.println(studentnr+" "+fornavn+" "+etternavn);
	}
	public String toString() {
		return studentnr+" "+fornavn+" "+etternavn;
	}
	
}
