
package test.problems;
public class MultiplyWithBits {
	public static void main(String args[]){
		int a=3;
		int b=3;
		int result = 0;
		while(b != 0 ){
			if((b&1) != 0){
				result=result+a;
			}
			a <<= 1;
			b>>=1;
		}
		System.out.println(result);
	}
}
