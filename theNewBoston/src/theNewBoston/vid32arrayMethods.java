package theNewBoston;

public class vid32arrayMethods {

	public static void main(String[] args) {
		
		int bucky[]= {3,4,5,6,7};
		
		for(int y:bucky) {
			System.out.print(y+"\t");
		}System.out.println();
		
		change1 (bucky);
		
		for(int y:bucky) {
			System.out.print(y+"\t");
		}System.out.println();
		
		change2 (bucky);
		
		for(int y:bucky) {
			System.out.print(y+"\t");
		}
	}
		
	public static void change1 (int x[]) {
		for (int counter=0;counter<x.length;counter++) {
			x[counter]+=5;			
		}
	}
	
	public static void change2 (int x[]) {
		for (int v:x) {
			v+=5;	
		}
	}
	
	
}
