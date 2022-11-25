package pattern;

import java.util.Scanner;

public class pattern3 {

	public static void main(String[] args) {
		
		/*
		  					*
		  				*	*
		  			*	*	*
		  		*	*	*	*
		  	*	*	*	*	*
		 * */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = sc.nextInt();
//		for(int i=n; i>=0; i--) {
//			for(int j=0; j<i; j++) {
//				
//				if(j==i-1) {
//					System.out.print("*");
//				}
//				System.out.print(" \t");
//			}
//			System.out.println();
//		}
		
		for(int i=0; i<n-1; i++) {
			for(int j=n; j<i; j--) {
				
			}
		}

	}

}
