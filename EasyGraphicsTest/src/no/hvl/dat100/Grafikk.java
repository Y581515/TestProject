package no.hvl.dat100;

import easygraphics.*;

public class Grafikk extends EasyGraphics {

	public static void main(String[] args) {
		launch(args);
	}

	public void run() {
		makeWindow("Grafikk", 800, 400);
		drawCircle(70, 70, 60);
		drawCircle(230, 70, 60);
		drawCircle(500, 70, 60);
		drawCircle(500, 190, 60);
	}

}
