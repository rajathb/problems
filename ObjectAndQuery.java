

package test.problems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

class ObjectAndQuery
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
		int mInputs = scanner.nextInt();
		int mQueries = scanner.nextInt();
		HashMap<String, String>[] dataMap = (HashMap<String, String>[])(new HashMap[mInputs]);
		for (int i = 0; i < mInputs; i++) {
			dataMap[i] = new HashMap<String, String>();
			int prop = scanner.nextInt();
			for (int j = 0; j < prop; j++) {
				dataMap[i].put(scanner.next(), scanner.next());
			}
		}
		int[] count = new int[mQueries];
		for (int k = 0; k < mQueries; k++) {
			HashMap<String, String> queryMap = new HashMap<String, String>();
			int queryprop = scanner.nextInt();
			for (int j = 0; j < queryprop; j++) {
				String key = scanner.next();
				String value = scanner.next();
				queryMap.put(key, value);
			}
			Set<Map.Entry<String,String>> querySet = queryMap.entrySet();
			//            System.out.println(" Query :: " + querySet.toString());
			for (HashMap<String, String> hashMap : dataMap) {
				boolean isEqual = true;
				Iterator<Entry<String, String>> iterator = querySet.iterator();
				while (iterator.hasNext()) {
					Entry<String, String> entry = (Entry<String, String>)iterator.next();
					if(!entry.getValue().equals(hashMap.get(entry.getKey()))){
						isEqual = false;
						break;
					}
				}
				if(isEqual) {
					count[k]++;
				}
			}
		}
		scanner.close();
		for (int i : count) {
			System.out.println("" + i);
		}
	}
}
