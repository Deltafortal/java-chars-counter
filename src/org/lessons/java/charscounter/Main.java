package org.lessons.java.charscounter;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		
		
		//Declaring variables
		Scanner in = new Scanner(System.in);
		String parola;
		Map<Character, Integer> caratteri = new HashMap<>();
		
		
		
		 System.out.print("Inserisci una parola: ");
		 parola = in.nextLine();
		
		 
		 
		 
		 //Main logic
		 for (char carattere : parola.toCharArray()) {
			 
			 if(caratteri.containsKey(carattere)) {
				 
				 caratteri.put(carattere, caratteri.get(carattere) + 1);
				 
			 } else {
				 
				 caratteri.put(carattere, 1);
				 
			 }
			 
			 	
		 }
		 
		 System.out.println(caratteri);
		 
		 in.close();
	}

}
