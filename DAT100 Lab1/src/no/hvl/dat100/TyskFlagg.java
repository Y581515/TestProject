package no.hvl.dat100;
import easygraphics.*;

public class TyskFlagg extends EasyGraphics {
	public static void main(String[] args) {
	    launch(args);
	  }
	
	

	  public void run() {
	    makeWindow("Det Tyske flagget");
	    final int BREDDE=300;
	    final int HOGDE= 200;
	    
	    int skalering=100; //heie prodent
	    
	    int bredde=(BREDDE*skalering)/100;
	    int hogde=HOGDE/3;
	    
	   

	    setColor(0,0,0);
	    drawRectangle(50, 50, 300, 200);
	    //svart
	    setColor(0, 0, 0);
	    fillRectangle(50, 50, bredde,hogde);
	    
	  //gull
	    setColor(255,0,0);
	    fillRectangle(50,50+2*hogde,bredde, hogde);
	    
	    
	    
	    //rød
	    setColor(255,255,0);
	    fillRectangle(50, 50+hogde, bredde, hogde);
	    
	   
	    
	    
	  }

	}	




