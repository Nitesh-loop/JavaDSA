package pattern;

import java.util.Scanner;

public class pattern6 {

	public static void main(String[] args) {
		
		/*
		  	*	*	*	-	*	*	*
		  	*	*	-	-	-	*	*
		  	*	-	-	-	-	-	*
		  	*	*	-	-	-	*	*
		  	*	*	*	-	*	*	*
		 * */
		
//		(3,1,3)
//		(2,3,2)
//		(1,5,1)
//		(2,3,2)
//		(3,1,3)
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = sc.nextInt();
		int st=n/2+1, sp=1;
		
		for(int i=0; i<n; i++) {
			
			for(int j=0; j<st; j++) {
				System.out.print("*\t");
			}
			for(int k=0; k<sp; k++) {
				System.out.print("\t");
			}
			for(int j=0; j<st; j++) {
				System.out.print("*\t");
			}
			
			if(i<n/2) {
				st--; sp+=2;
			}
			else {
				st++; sp-=2;
			}
			
			System.out.println();
		}

	}

}
