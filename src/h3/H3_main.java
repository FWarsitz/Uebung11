package h3;

public class H3_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] unsorted = {5, 2, 8, 1, 9, 3, 7, 4, 6};  // Länge 9
        int[] sorted = mergeSort(unsorted);
        
        System.out.print("Unsorted: ");
        printArray(unsorted);
        System.out.print("Sorted:   ");
        printArray(sorted);
		
	}

	public static int[] mergeSort(int[] arr) {
		if (arr.length <= 1) {
			return arr;
		}
		
		int mid = arr.length / 2;
		
		int[] left = new int[mid];
		for (int i = 0; i < left.length; i ++) {
			left[i] = arr[i];
		}
		
		int[] right = new int[arr.length - mid];
		for(int j = 0; j < right.length; j++) {
			right[j] = arr[mid +j];
		}
		
		left = mergeSort(left);
		right = mergeSort(right);
		
		int[] result = new int[left.length + right.length];
		
		int i = 0, j = 0, k = 0;
		
		while ( i < left.length && j < right.length) {
			if ( left[i] <= right[j]) {
				result[k] = left[i];
				k++;
				i++;
			}else {
				result[k] = right[j];
				k++;
				j++;
			}
		}
		
		while (i < left.length) {
			result[k] = left [i];
			k++;
			i++;
		}
		while (j < right.length) {
			result[k] = right[j];
			k++;
			j++;
		}
		
		return result;
		
	}
	
	
	 // Test-Ausgabe
    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
	
}
