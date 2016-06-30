

package test.problems;

import java.util.ArrayList;
import java.util.List;

public class CoinChange {
	
	
	
	static int amount = 3;
	
	public static void main(String[] args) {
		int [] denominations = {1,2,3};
		List solutions = new ArrayList();
		String tempSolution = "";
		findAllSolutions(0, amount,denominations,tempSolution,solutions);
		System.out.println("All Solutions:"+solutions);

	}
	
	private static void findAllSolutions(int startIndex, int remainingTarget, int [] denominations,String tSol, List solutions){
		for(int i=startIndex;i<denominations.length;i++){
			int localSolution = remainingTarget - denominations[i];
			String tempSolution = tSol+" "+denominations[i]+",";
			if(localSolution<0){
				break;
			}
			if(localSolution == 0){
				//solution reached
				solutions.add(tempSolution);
				break;
			}
			else{
				findAllSolutions(i,localSolution,denominations, tempSolution,solutions);
			}
		}
	}

}
