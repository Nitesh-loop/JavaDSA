package pattern;

import java.util.Scanner;

public class pattern4 {

	public static void main(String[] args) {
		
		/*
		  	*	*	*	*	*
		  		*	*	*	*
		  			*	*	*
		  				*	*
		  					*
		 * */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = sc.nextInt();

		
		for(int i=0; i<n; i++) {
			for(int j=n-1; j>i; j--) {
				System.out.print("\t");
			}
			for(int k=0; k<=i; k++) {
				System.out.print("*\t");
			}
			System.out.println();
		}

	}

}
