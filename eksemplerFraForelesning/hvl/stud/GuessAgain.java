package hvl.stud;
import static javax.swing.JOptionPane.*;

public class GuessAgain {

	public static void main(String[] args) {
		final int NEDRE=0;
		final int OVRE=1000;
		
		String melding= "Tenk p� et tall i omr�det "+NEDRE+"_"+OVRE;
		showMessageDialog(null, melding);
		
		int lav=NEDRE;
		int hoy=OVRE;
		int tall=NEDRE-1;
		boolean rettGjetta=false;
		
		do{
			tall=(lav+hoy)/2;
			melding = "Tenkte du p� " + tall +"? skriv 0 for ja, -1 hbis for h�yt, 1 hvis for lavt";
			int svar=Integer.parseInt(showInputDialog(melding));
			
			rettGjetta=(svar ==0);
			
			if(!rettGjetta){
				if(svar==-1){
					hoy=tall-1;
				}else {
					lav=tall+1;
				}
			}
		}while(!rettGjetta);
		showMessageDialog(null,"Gratulerer");
	}
}
