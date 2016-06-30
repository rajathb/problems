
package test.problems;
public class PossibleCombinations {
	public static void main(String[] arr) {
		combination("", "1234");
	}

	private static void combination(String prefix, String str) {
		System.out.println("Prefix:"+prefix+" str:"+str);
		int n = str.length();
		if (n == 0)
			System.out.println(prefix);
		else {
			for (int i = 0; i < n; i++)
				combination(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));
		}
	}

}