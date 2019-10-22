package fr.appli.nounou;

import java.util.Scanner;

class Main {

	static Scanner entrée = new Scanner(System.in);

	static int min2(int a, int b) {
		if(a<=b) {
			return a;
		}else {
			return b;
		}
	}

	public static void main(String[] args) {

		int nbr1 = entrée.nextInt();
		int nbr2 = entrée.nextInt();
		int result = min2(nbr1,nbr2);
		
		for(int i = 0; i<8;i++) {
			int nbr = entrée.nextInt();
			result = min2(nbr,result);
		}
		System.out.println(result);
		
	}
}