package fr.appli.nounou;

import java.util.Scanner;

class Main {

	static Scanner entrée = new Scanner(System.in);

	static void ligneCaractères(char caractère, int longueur) {
		   for (int iCol = 0; iCol < longueur; iCol = iCol + 1) {
		      System.out.print(caractère);
		   }
		   System.out.println();
		}
	
	public static void main(String[] args) {

		int nbrCaractere= entrée.nextInt();
		
		ligneCaractères('X',nbrCaractere);
		ligneCaractères('#',nbrCaractere);
		ligneCaractères('i',nbrCaractere);
	}
}