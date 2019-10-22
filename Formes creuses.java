package org.france.ioi;

import java.util.Scanner;

class Main {

	static Scanner entrée = new Scanner(System.in);

	static void ligne(int nbr) {
		for(int i = 0;i<nbr;i++) {
			System.out.print('X');
		}
		System.out.println();
		System.out.println();
	}

	static void rectangle(int ligne, int col) {
		for(int i = 0;i<ligne;i++) {
			for(int j=0;j<col;j++) {
				if(i==0 || j==0 || j==col-1 || i==ligne-1) {
					System.out.print('#');
				}
				if(i>0 && j>0 && j<col-1 && i<ligne-1) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}

	static void arobase(int nbr) {
		for(int i = 0;i<nbr;i++) {
			for(int j=0; j<nbr; j++) {
				if(i==j || j==0 || i==nbr-1) {
					System.out.print('@');
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
			
	}

	public static void main(String[] args) {

		int nbr1 = entrée.nextInt();
		int ligne = entrée.nextInt();
		int col = entrée.nextInt();
		int aro = entrée.nextInt();
		ligne(nbr1);
		rectangle(ligne, col);
		arobase(aro);
		
		
	}
}
