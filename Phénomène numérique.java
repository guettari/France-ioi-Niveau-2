package fr.appli.nounou;

import java.util.Scanner;

class Main {

	static Scanner entrée = new Scanner(System.in);

	static int terme(int a) {
		if(a%2==0) {
			return a/2;
		}else {
			return a*3+1;
		}
	}

	public static void main(String[] args) {

		int nbr1 = entrée.nextInt();
		int result = terme(nbr1);
		System.out.print(result+" ");
		
		while (!(result==1)) {
			result = terme(result);
			System.out.print(result+" ");
		}
	}
}