package currency.service;

import java.util.Scanner;

public class Service {
	public void notesCountImplementation( int[] notes, int amount) {
		int[] noteCounter= new int [notes.length];
		Scanner sc = new Scanner(System.in);
		int size= notes.length;
		if(amount>0) {
			for(int i=0; i< size; i++) {
				if (amount>= notes[i]) {
					noteCounter[i]= amount / notes[i];
					amount = amount -noteCounter[i] * notes[i];
				}
			}
			if (amount>0) {
				System.out.println("exact amount cannot be give with the given currency denomination");
			}else {
				System.out.println("Your payment approach in order to give minimum no of notes will be");
				for (int i=0; i<size; i++){
					if (noteCounter[i] != 0) {
						System.out.println(notes[i] + ":" + noteCounter[i]);
					}
				}
			}
			
		}else {
			System.out.println("Enter the valid amount to pay");
			int amount1 = sc.nextInt();
			notesCountImplementation(notes, amount1);
		}
		sc.close();
	}
}
