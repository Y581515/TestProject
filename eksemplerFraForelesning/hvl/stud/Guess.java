package hvl.stud;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Guess {

  public static void main( String[] args ) {
    int laveste = 0, h�yeste = 1000;
    
    String melding =( "Tenk p� et tall i omr�det " +
                     laveste + " -- " + h�yeste + ".");
    showMessageDialog(null, melding);
    
    int tall = (laveste + h�yeste) / 2;
    boolean riktigGjettet = false;
   
    while ( !riktigGjettet ) {
      melding = "Tenkte du p� " + tall + "? "
              + "Skriv 0 for ja, -1 hvis for h�yt, "
              + "1 hvis for lavt:";
      int svar = parseInt( showInputDialog(melding) );    

      if ( svar == 0 )
        riktigGjettet = true;
      else if ( svar == -1 )
        h�yeste = tall - 1 ;
      else
        laveste = tall + 1;    
    
      if ( laveste == h�yeste )
        riktigGjettet = true;    
       
      tall = (laveste + h�yeste) / 2;
      
    }

    melding = "Du tenkte p� " + tall + "!";
    showMessageDialog(null, melding);
    System.out.println(tall);
  }

}