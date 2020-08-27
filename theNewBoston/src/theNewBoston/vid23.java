package theNewBoston;

public class vid23 {

	public static void main(String[] args) {
		double amount;
		double principal=1000;
		double rate=0.01;
		for (int day=365;day<=365;day=day+1){
			amount=principal*Math.pow(1+rate, day);
		System.out.println(day +"   "+amount);
			
		}

	}

}
