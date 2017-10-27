package test;

import java.util.Scanner;

public class Game {
	Mastermind mas;
	PlusOuMoins plm;
	public void start() {
		Scanner sc = new Scanner(System.in);
		System.out.println("***********************************************************");
		System.out.println("Bienvenue !!! Veuillez choisir un jeu entre 1 et 2 :");
		System.out.println("1.Mastermind");
		System.out.println("2.Plus ou moins");
		System.out.println("***********************************************************");
		String str = sc.nextLine();
		switch(str) {
		case "1":
			mas = new Mastermind();
			mas.toString();
			break;
		case "2":
			plm = new PlusOuMoins();
			plm.toString();
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
