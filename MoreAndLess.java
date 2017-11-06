package test;

import java.util.Scanner;

public class MoreAndLess {
	public MoreAndLess() {
		int secretNumber;
		int guessNumber = 0;
		Scanner enterKeyboard;
		
		System.out.println("Bienvenue dans Plus ou moins");
		
		enterKeyboard = new Scanner(System.in);
		secretNumber = (int) ((Math.random() * 9999) + 1); // random number
		
		do {
			System.out.println(secretNumber);
			System.out.println("Entrez un nombre entre un nombre");
			guessNumber = enterKeyboard.nextInt();
			
			if(secretNumber == guessNumber) {
				System.out.println("Le compte est bon !!!!");
			}else if ( guessNumber < secretNumber) {
				System.out.println("le nombre est plus grand !");
			} else {
				System.out.println("le nombre est plus petit !");
			}
			
		}while ( guessNumber != secretNumber);
		
		
		
	}

}
