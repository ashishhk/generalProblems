
public class SelectionSort extends AbstractCustomSorting implements CustomSorting {

	@Override
	public void sort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int minIndex=i;
			for(int j=i; j <arr.length;j++) {
				if(arr[minIndex]>arr[j]) {
					minIndex=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[minIndex];
			arr[minIndex]=temp;
			printArray(arr);
		}
	}

	@Override
	public void printAdvice() {
		System.out.println("Time Complexity: O(n2) as there are two nested loops.\nAuxiliary Space: O(1)\n"
				+ "The good thing about selection sort is it never makes more than O(n) swaps and can be useful when memory write is a costly operation.");
	}

}
