package fr.appli.nounou;

import java.util.Scanner;

class Main {

	static Scanner entrée = new Scanner(System.in);

	static void ligneCaractères(String caractère, int col, int ligne) {
		for (int iCol = 0; iCol < col; iCol = iCol + 1) {
			for (int iLigne = 0; iLigne < ligne; iLigne++) {
				System.out.print(caractère);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		int col = entrée.nextInt();
		int ligne = entrée.nextInt();
		String caractere = entrée.next();

		ligneCaractères(caractere, col, ligne);

	}
}