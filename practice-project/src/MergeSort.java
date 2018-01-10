
public class MergeSort extends AbstractCustomSorting {

	@Override
	public void sort(int[] arr) {
		if(arr.length<=2) {
			if(arr.length==0 || arr.length==1) {
				return;
			}
			if(arr[1]<arr[0]) {
				int temp= arr[0];
				arr[0]=arr[1];
				arr[1]=temp;
			}
			return;
		}
		int size=arr.length;
		int[] left=new int[size/2];
		int[] right= new int[size-size/2];
		for(int i=0;i<left.length;i++) {
			left[i]=arr[i];
		}
		for(int i=0;i<right.length;i++) {
			right[i]=arr[left.length+i];
		}
		sort(left);
		sort(right);
		merge(arr,left,right);
	}
	
	private void merge(int[] mergedArray,int[] left, int[] right) {
		int count=0;
		for(int i=0,j=0;count<mergedArray.length;) {
			if(i==left.length) {
				while(count<mergedArray.length) {
					mergedArray[count++]=right[j++];
				}
				break;
			}
			if(j== right.length) {
				while(count<mergedArray.length) {
					mergedArray[count++]=left[i++];
				}
				break;
			}
			if(left[i]<right[j]) {
				mergedArray[count++]=left[i++];
			}
			else {
				mergedArray[count++]=right[j++];
			}
		}
	}

	@Override
	public void printAdvice() {
		System.out.println("O(nlogn)");
	}
}
