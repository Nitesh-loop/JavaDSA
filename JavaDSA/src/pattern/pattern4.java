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
		int sp=0, st=n;
		
		for(int i=0; i<n; i++) {
			
			for(int j=0; j<sp; j++) {
				System.out.print("\t");
			}
			for(int k=0; k<st; k++) {
				System.out.print("*\t");
			}
			sp++;
			st--;
			System.out.println();
		}

	}

}
