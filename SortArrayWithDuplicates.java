package test.problems;
public class SortArrayWithDuplicates {
	public static void main(String[] args) { 
		int arr[] = { 2, 9, 1, 5, 1, 4, 9, 7, 2, 1, 4 }; 
		int mid = arr.length / 2; 
		System.out.println("midle:: " + mid); 
		sortArray(arr); 
		for (int i = 0; i < arr.length; i++) { 
			for (int j = i + 1; j < arr.length; j++) { 
				if(arr[j] == arr[i]){ 
					for(int k = j+1; k < arr.length; k++ ){ 
						int jTemp = arr[j]; 
						if(arr[k] > jTemp){ 
							arr[j] = arr[k]; 
							arr[k] = jTemp; 
							break; 
						} 
					} 
				} 
			} 
		} 
		System.out.println("Equal Sort after:::: "); 
		for (int i = 0; i < arr.length; i++) { 
			System.out.print(arr[i] + ","); 
		} 
		for(int z = 0; z < arr.length; z++){ 
			if(arr[z] >= arr[z+1]){ 
				for(int x = z+1; x<arr.length; x++){ 
					for(int y=x+1; y<arr.length; y++){ 
						if(arr[x] > arr[y]){ 
							int xTemp = arr[x]; 
							arr[x] = arr[y]; 
							arr[y] = xTemp; 
						} 
					} 
				} 
				break; 
			} 
		} 
		System.out.println("Array Data::After "); 
		for (int i = 0; i < arr.length; i++) { 
			System.out.print(arr[i] + ","); 
		} 
	} 
	public static void sortArray(int arr[]){ 
		for (int i = 0; i < arr.length; i++) { 
			for (int j = i + 1; j < arr.length; j++) { 
				if (arr[i] != arr[j]) { 
					if (arr[i] > arr[j]) { 
						int temp = arr[i]; 
						arr[i] = arr[j]; 
						arr[j] = temp; 
					} 
				} 
			} 
		} 
		System.out.println("Afeter sorting "); 
		for (int i = 0; i < arr.length; i++) { 
			System.out.print(arr[i] + ","); 
		} 
	} 
}


