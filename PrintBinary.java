
package test.problems;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Given a decimal number n, print all binary values from 1 to n
 * PrintBinary
 * @version		$Revision$ $Date$
 * @author balar3
 *
 */
public class PrintBinary {
	

	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		usingInBuiltFunction(n);
		System.out.println("=========================");
		usingQueues(n);
	}

	/**
	 * @param n
	 */
	private static void usingQueues(int n) {
		Queue q = new LinkedList();
		int counter = 1;
		//Enqueue 1
		q.add("1");
		while(counter<=n){
			//dequeue 
			String binary = (String) q.remove();
			//print the dequeued number
			System.out.println(binary);
			//append 0 and 1 to the dequeued element and enqueue back
			q.add(binary+"0");
			q.add(binary+"1");
			counter++;
		}
	}
	
	private static void usingInBuiltFunction(int n){
		for(int i=1;i<=n;i++){
			System.out.println(Integer.toBinaryString(i));
		}
		
	}

}
