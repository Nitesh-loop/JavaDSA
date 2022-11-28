package pattern;

import java.util.Scanner;

public class pattern7 {

	public static void main(String[] args) {
		
		/*
		  	*				
		  	-	*			
		  	-	-	*		
		  	-	-	-	*	
		  	-	-	-	-	*
		 * */
		
//		(0,1)
//		(1,1)
//		(2,1)
//		(3,1)
//		(4,1)
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = sc.nextInt();
		int sp=0, st=1;
		
		for(int i=0; i<n; i++) {
			
			for(int j=0; j<sp; j++) {
				System.out.print("\t");
			}
			for(int k=0; k<st; k++) {
				System.out.print("*");
			}
			sp++;
			
			System.out.println();
		}

	}

}
