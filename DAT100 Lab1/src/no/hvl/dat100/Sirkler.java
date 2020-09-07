package no.hvl.dat100;
import easygraphics.*;

public class Sirkler extends EasyGraphics {

	public static void main(String[] args) {
		launch(args);
	}
	
	public void run() {
		makeWindow("Sirkler", 400, 400);
		int y = 50;
		int x = 20;
		int radius = 15;
		boolean medFyll = false;
		
		pause (2000);
		for (int i = 1; i <= 10; i++) {
			 
			 if (medFyll) {
				 fillCircle(x, y, radius);
			 } else {
				 drawCircle(x, y, radius);
			 }
			 x += 2 * radius;
			 medFyll = !medFyll;
			 pause(500);
		}
		
	}

}
