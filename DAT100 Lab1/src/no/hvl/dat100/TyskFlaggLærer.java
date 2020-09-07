package no.hvl.dat100;
import easygraphics.*;

public class TyskFlaggLærer extends EasyGraphics {

	public static void main(String[] args) {
		launch(args);
	}

	public void run() {
		makeWindow("Det tyske flagget");

		final int BREDDE = 300;
		final int HOGDE = 200;

		int skalering = 150; // Heile prosent

		int bredde = (BREDDE * skalering) / 100 ;
		int hogde = (HOGDE * skalering) / (3 * 100);

		// svart
		setColor(0, 0, 0);
		fillRectangle(50, 50, bredde, hogde);

		// raud
		setColor(255, 0, 0);
		fillRectangle(50, 50 + hogde, bredde, hogde);

		// gul
		setColor(255, 255, 0);
		fillRectangle(50, 50 + 2 * hogde, bredde, hogde);

		// ramme rundt
		setColor(0, 0, 0);
		drawRectangle(50, 50, bredde, 3 * hogde);
	}

}
