package studio0;

import java.util.Scanner;

public class Testing3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("How many numbers?");
		int n = in.nextInt();
		Boolean[] array = new Boolean [n+1];
		
		for (int i = 0; i<n+1; i++) {
			array[i] = true;
		}
		
		
		for (int k = 2; k<(n/2); k++) {
			for(int j = 2; (j*k) <= n; j++) {
				array[k*j]= false;
			} 
		}
			
			for (int o = 2; o<n+1; o++) {
				if (array[o]) {
					System.out.println(o);
			}
	}

}}
