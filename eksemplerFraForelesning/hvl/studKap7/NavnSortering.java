package hvl.studKap7;

import java.io.*;

import java.util.*;


public class NavnSortering {
	
	public static void main(String[] args) throws Exception{
		
		File innfil= new File ("navn.txt");
	
		Scanner leser = new Scanner(innfil);
		
		int antNavn= Integer.parseInt(leser.nextLine());
		String [] navnTab= new String [antNavn];
		
		for(int i=0;i<antNavn;i++) {
			navnTab[i]=leser.nextLine();
		}
		leser.close();
		
		Arrays.sort(navnTab);
		
		File utfil=new File ("sortert.text");
		PrintWriter skriver = new PrintWriter(utfil);
		
		for(String navn: navnTab) {
			System.out.println(navn);
		}skriver.close();
		
	}

}
