

package test.problems;
public class MaxContinousProduct {


	public static void main(String[] args) {
		int [] input = {2,3,-2,4};
		System.out.println(maxProduct(input));

	}

	private static int maxProduct(int[] input) {
		int newProduct = input[0];
		int maxProduct = input[0];
		for(int i=1;i<input.length;i++){
			newProduct = Math.max(input[i],input[i]*newProduct);
			maxProduct = Math.max(maxProduct, newProduct);
		}
		return maxProduct;
	}


}
