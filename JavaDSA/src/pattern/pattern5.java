package pattern;

import java.util.Scanner;

public class pattern5 {

	public static void main(String[] args) {
		
		/*
		  			*		
		  		*	*	*	
		  	*	*	*	*	*
		  		*	*	*	
		  			*		
		 * */
		
//		(2,1)
//		(1,3)
//		(0,5)
//		(1,3)
//		(2,1)
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = sc.nextInt();
		int sp=n/2, st=1;
		
		for(int i=0; i<n; i++) {
			
			for(int j=0; j<sp; j++) {
				System.out.print("\t");
				
			}
			for(int k=0; k<st; k++) {
				System.out.print("*\t");
				
			}
			
			
			
			if(i < n/2) {
				sp--; st+=2;
			}
			else {
				sp++; st-=2;
			}
			
			System.out.println();
		}

	}

}
