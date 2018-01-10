
public class InsertionRecSort extends AbstractCustomSorting {

	@Override
	public void sort(int[] arr) {
		sort(arr,arr.length-1);
	}
	
	public void sort(int[] arr, int n) {
		if(n<1) {
			return;
		}
		sort(arr,n-1);
		int j=n-1;
		int numberToMove=arr[n];
		while (j >= 0 && numberToMove < arr[j]) {
			arr[j + 1] = arr[j--];
		}
		arr[j+1]=numberToMove;
		printArray(arr);
	}

	@Override
	public void printAdvice() {
		System.out.println("Time Complexity: O(n*n)\r\n" + 
				"\r\n" + 
				"Auxiliary Space: O(1)\r\n" + 
				"\r\n" + 
				"Boundary Cases: Insertion sort takes maximum time to sort if elements are sorted in reverse order. And it takes minimum time (Order of n) when elements are already sorted.\r\n" + 
				"\r\n" + 
				"Algorithmic Paradigm: Incremental Approach\r\n" + 
				"\r\n" + 
				"Sorting In Place: Yes\r\n" + 
				"\r\n" + 
				"Stable: Yes\r\n" + 
				"\r\n" + 
				"Online: Yes\r\n" + 
				"\r\n" + 
				"Uses: Insertion sort is used when number of elements is small. It can also be useful when input array is almost sorted, only few elements are misplaced in complete big array.");
	}

}
