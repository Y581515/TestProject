package hvl.studKap6;

public class StudentTable {

	public static void main(String[] args) {
		Student[] sTab= new Student[3];
		sTab[0]= new Student(7, "Ole", "Olsen");
		sTab[1]= new Student(11, "Kari", "Nilsen");
		sTab[2]= new Student(15, "Nils", "Nilsen");
		
		for(Student s: sTab) {
			s.skriveUt();
		}System.out.println();
		
		Student s1=sok(sTab, 11);
		if(s1 != null) {
			System.out.println("fann Studenten");
			//System.out.println(s1.toString());
			s1.skriveUt();System.out.println();
		}else {
			System.out.println("fann ikke Studenden");
		}
		
		
		String navn="Peter";
		Student s2=sok2(sTab, navn);
		if(s2 != null) {
			System.out.println("fann Studenten");
			System.out.println(s2.toString());
			//s2.skriveUt();
		}else {
			System.out.println("fann ikke Studenden: "+ navn);
		}	
		
		
	}
	
	
	public static Student sok2(Student [] tab, String navn) {
		int i=0;
		boolean funnet=false;
		Student svar=null;
		while(!funnet && i<tab.length) {
			if(navn==tab[i].getFn() || navn==tab[i].getEn()) {
				svar=tab[i];
				funnet=true;
			}else {
				i++;
			}
		}
		return svar;
	}
	
	public static Student sok(Student [] tab, int tall) {
		int i=0;
		boolean funnet=false;
		Student svar=null;
		while(!funnet && i<tab.length) {
			if(tall==tab[i].getNr()) {
				svar=tab[i];
				funnet=true;
			}else {
				i++;
			}
		}	
		
		return svar;
	}
}
