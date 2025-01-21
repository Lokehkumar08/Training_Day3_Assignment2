package Assignemnt2;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class InteractiveApp{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Type anything and Enter or Type end to end the program/process " );
	    String string = sc.nextLine();
	    Set<String> Censorwords =new <HashSet>();
	    Censorwords.add("badword");
	    Censorwords.add("hate");
	    Cesorwords.add("ugly");
	    while(!(string.toLowerCase().equals("end"))) {
	    	if(Censorwords.contains(string).toLowerCase()) {
	    		System.out.println("You types the censored word : ****** ");
	    	}
	    	else {
	    		System.out.println("you typed " + string.toUpperCase());
	    	}
	    	System.out.println("program ended");
	    	
	    }
	}
}