

package test.problems;

import java.util.Scanner;

public class NumberPyramid {
	public static void main(String[] args) {
		System.out.println("Enter Height of Pyramid:");
		Scanner sc = new Scanner(System.in);
		int noOfLines = sc.nextInt();
		printPyramid(noOfLines);

	}
	private static void printPyramid(int noOfLines){
		//for each row in pyramid
		for(int i=1;i<=noOfLines;i++){
			//initial zeroes
			for(int j=1;j<=noOfLines-i;j++){
				System.out.print(".");
			}
			//print left of mid
			for(int k=1;k<=i;k++){
				System.out.print(k);
			}
			//print right of mid
			for(int m=i-1; m>0 ; m--){
				System.out.print(m);
			}
			//go to next line
			System.out.println();
		}
	}

}
