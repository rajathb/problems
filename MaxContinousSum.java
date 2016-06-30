

package test.problems;
public class MaxContinousSum {
	public static void main(String[] args) {
		//[-2,1,-3,4,-1,2,1,-5,4], the contiguous subarray [4,-1,2,1] has the largest sum = 6
		int [] input = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println("Max Sum:"+maxSubArray(input));
	}
	public static int maxSubArray(int[] A) {
		int newsum=A[0];
		int max=A[0];

		for(int i=1;i<A.length;i++){
			newsum=Math.max(newsum+A[i],A[i]);

			max= Math.max(max, newsum);
		}

		return max;
	}

}
