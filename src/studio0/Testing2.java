package studio0;

import java.util.Scanner;

public class Testing2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter an integer");
		int n = in.nextInt();
		System.out.println("Enter another integer");
		int m = in.nextInt();
		int[][] array = new int [n][m];
		
		for (int i = 0; i<(n*m/4); i++) {
				double randomNumber = (Math.random()*(n-1));
				double randomNumber2 = (Math.random()*(m-1));
				int rando1Rounded = (int)(Math.round(randomNumber));
				int rando2Rounded = (int)(Math.round(randomNumber2));
				array[rando1Rounded][rando2Rounded] = 1;
				array[rando1Rounded][(m-1) - rando2Rounded] = 1;	
			}
		for (int i = 0; i<array.length; i++) {
			for (int j = 0; j<array[j].length; j++) {
			if (array[i][j] == 1) {
				System.out.println("*");
			} else {
				continue;
			}
		}
		}
		
	}}