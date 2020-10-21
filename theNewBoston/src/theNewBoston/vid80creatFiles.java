package theNewBoston;
import java.lang.*;
import java.io.*;

import java.util.*;

public class vid80creatFiles {
	
	public vid80creatFiles() {
		
	}
	private Formatter x;
	
	public void openFile() {
		try {
			x= new Formatter("chinese.txt");
		}
		catch(Exception e) {
			System.out.println("you have an error");
		}	
	}
	
	public void addRecords() {
		x.format("%s%s%s", "20 ","bucky ", "Roberts");
		
	}
	
	public void closeFile() {
		x.close();
	}
	

}
