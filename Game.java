package test;

import java.util.Scanner;

public class Game {
	Mastermind mastermind;
	MoreAndLess moreAndLess;
	public void start() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("***********************************************************");
		System.out.println("Bienvenue !!! Veuillez choisir un jeu entre 1 et 2 :");
		System.out.println("1.Mastermind");
		System.out.println("2.Plus ou moins");
		System.out.println("***********************************************************");
		String recoveryReponse = scanner.nextLine();
		switch(recoveryReponse) {
		case "1":
			mastermind = new Mastermind();
			mastermind.toString();
			break;
		case "2":
			moreAndLess = new MoreAndLess();
			//moreAndLess.toString();
			break;
			default:
				System.out.println("Mauvais choix");
		}
		/*if(str == "1")
			System.out.println("choix 1");
		else
			mas = new Mastermind();
			System.out.println("Choix du jeu "+mas.getClass().getName());
			System.out.println("Jeu lancé !");
			*/
		
		
	}
}
