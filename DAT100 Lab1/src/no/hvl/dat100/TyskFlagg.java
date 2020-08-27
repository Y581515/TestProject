package no.hvl.dat100;
import easygraphics.*;

public class TyskFlagg extends EasyGraphics {
	public static void main(String[] args) {
	    launch(args);
	  }

	  public void run() {
	    makeWindow("Det Tyske flagget");

	    setColor(0,0,0);
	    drawRectangle(50, 50, 300, 201);
	    
	    setColor(0,0,0);
	    fillRectangle(50, 50, 300,67);
	    setColor(255,0,0);
	    fillRectangle(50, 117, 300,67);
	    setColor(255, 204, 0);
	    fillRectangle(50, 184, 300,67);
	  }

	}	




