package org.france.ioi;

import java.util.Scanner;

class Main {

	static Scanner entrée = new Scanner(System.in);

	static double calcul(double x1, double y1, double x2, double y2) {
		return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
	}

	static void distance() {
		double x1 = entrée.nextDouble();
		double y1 = entrée.nextDouble();
		double x2 = entrée.nextDouble();
		double y2 = entrée.nextDouble();

		System.out.println(calcul(x1, y1, x2, y2));
	}

	public static void main(String[] args) {

		distance();
	}
}
