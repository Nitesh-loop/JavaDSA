package pattern;

import java.util.Scanner;

public class pattern2 {


	public static void main(String[] args) {
		
		/*
		 * 	*	*	*	*
		 * 	*	*	*
		 * 	*	*
		 * 	*	
		 * 
		 * */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of n");
		int n = sc.nextInt();
		for(int i=n; i>=0; i--) {
			for(int j=0; j<i; j++) {
				System.out.print("*\t");
			}
			System.out.println();
		}
		sc.close();
	}

}
