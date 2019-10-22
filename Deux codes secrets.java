package fr.appli.nounou;

import java.util.Scanner;

class Main {

	static Scanner entrée = new Scanner(System.in);

	static void affiche1() {
		boolean vérif = false;
		
		System.out.println("Entrez le code :");
		while (!vérif) {

			int code = entrée.nextInt();
			if (code == 4242) {
				vérif = true;
			} else {
				vérif = false;
				System.out.println("Entrez le code :");
			}
				
		}
	}

	static void affiche2() {
		boolean vérif = false;

		System.out.println("Entrez le code :");
		while (!vérif) {

			int code = entrée.nextInt();
			if (code == 2121) {
				vérif = true;
			} else {
				vérif = false;
				System.out.println("Entrez le code :");
			}
				
		}
	}
	
	public static void main(String[] args) {

		affiche1();

		System.out.println("Premier code bon.");

		affiche2();
		System.out.println("Bravo.");
	}
}