package org.france.ioi;

import java.util.Scanner;

class Main {

	static Scanner entrée = new Scanner(System.in);

	public static void main(String[] args) {

		int nbr = entrée.nextInt();

		for (int i = 0; i < nbr; i++) {
			String mesure = entrée.nextLine();

			String[] a = mesure.split(" ");
			double mesureToConvert = Double.parseDouble(a[0].replace(",", "."));
			double newMesure = 0;
			String newUnité = "";

			switch (a[1]) {
			case "m":
				newMesure = mesureToConvert / 0.3048;
				newUnité = "p";
				break;
			case "g":
				newMesure = mesureToConvert * 0.002205;
				newUnité = "l";
				break;
			case "c":
				newMesure = 32 + 1.8 * mesureToConvert;
				newUnité = "f";
				break;

			default:
				break;
			}

			double result = (double) Math.round(newMesure*1000000)/1000000;
			System.out.println(result + " " + newUnité);
		}

	}
}
