
package test.problems;
public class LargestIncreasingSubsequence {


	public static void main(String[] args) {
		//int [] input = {0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15};
		int [] input = {6, 4, 1,  2};
		System.out.println(increasingSubsequence(input));
	}
	public static int increasingSubsequence(int[]seq){
		int[]L=new int[seq.length];
		L[0]=1;
		for(int i=1;i<L.length;i++){
			int maxn=0;
			for(int j=0;j<i;j++){
				if(seq[j]<seq[i]&&L[j]>maxn){
					maxn=L[j];
				}
			}
			L[i]=maxn+1;
		}
		int maxi=0;
		for(int i=0;i<L.length;i++){
			if(L[i]>maxi){
				maxi=L[i];
			}
		}
		return(maxi);
	}

}
