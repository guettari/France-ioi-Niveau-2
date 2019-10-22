package org.france.ioi;

import java.util.Scanner;

class Main {

	static Scanner entrée = new Scanner(System.in);

	static void affiche() {
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

	public static void main(String[] args) {
		
		affiche();

		System.out.println("Encore une fois.");

		affiche();
		System.out.println("Bravo.");
	}
}
