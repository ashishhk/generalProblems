import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.allFactors(85463));
		/*int limit=Integer.MAX_VALUE/10;
		int [] input =new int[limit];
		for(int i=0;i<limit;i++) {
			input[i]=i+1;			
		}
		input[4]=3;
		System.out.println(sol.repeatedNumber(input));
		*/
		//System.out.println(sol.largestNumber( new int [] {3, 30, 34, 5, 9}));
	}

}


class Solution {
    public int[] allFactors(int A) {
        //List<Integer> list= new ArrayList<Integer>();
        int size=(int)(2*Math.sqrt(A))-1;
        int []out= new int [size];
        int divisor =1; int count=0;
        while(divisor<=Math.sqrt(A)){
            if(A%divisor==0){
                //list.add(divisor++);
                out[count++]=divisor;
                if(divisor!=Math.sqrt(A)){
                    //list.add(A/divisor);
                    out[count++]=A/divisor;
                }
                divisor++;
            }
        }
        //return toIntArray(list);
        //return list.stream().mapToInt(i->i).toArray();
        return out;
    }
    private int[] toIntArray(List<Integer> list)  {
        int[] ret = new int[list.size()];
        int i = 0;  
        for (Integer e : list)  
            ret[i++] = e.intValue();
        return ret;
    }
}


class Solutio1n {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public String largestNumber(final int[] A) {
    	StringBuilder strBuilder= new StringBuilder();
    	MergeSort sorter = new MergeSort();
       // sorter.sort(A,0,A.length-1);
    	StringBuilder str= new StringBuilder();
        for(int i=0;i<A.length-1;i++)
        {
        	str.append(A[i]);
        }
        return str.toString();
    }
}

class MergeSort1
{
    // Merges two subarrays of arr[].
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
    void merge(int arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;
 
        /* Create temp arrays */
        int L[] = new int [n1];
        int R[] = new int [n2];
 
        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i)
            L[i] = arr[l + i];
        for (int j=0; j<n2; ++j)
            R[j] = arr[m + 1+ j];
 
 
        /* Merge the temp arrays */
 
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
 
        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
 
        /* Copy remaining elements of L[] if any */
        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }
 
        /* Copy remaining elements of R[] if any */
        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
 
    // Main function that sorts arr[l..r] using
    // merge()
    void sort(int arr[], int l, int r)
    {
        if (compare(l,r))
        {
            // Find the middle point
            int m = (l+r)/2;
 
            // Sort first and second halves
            sort(arr, l, m);
            sort(arr , m+1, r);
 
            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }

	private boolean compare(int l, int r) {
		l=reverse(l);
		r=reverse(r);
		while(l/10!=0 || r/10!=0) {
			if(l%10<r/10) {
				return true;
			}
			else if(l%10==r%10) {
				l/=10;
				r/=10;
				if(l<r) {
					return true;
				}
				continue;
			}
			else {
				return false;
			}
		}
		return false;
	}
	public int reverse(int number){
		StringBuilder rev = new StringBuilder();
		while(number/10!=0) {
			rev.append(number%10);
			number/=10;
		}
		if(rev.toString().equals("")) {
			return number;
		}
		return Integer.valueOf(rev.toString());
	}
}

class Solution2 {
	// DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
	public int[] repeatedNumber(final int[] A) {
		int[] out = new int[2];
		for (int i = 0; i < A.length; i++) {
			if (A[Math.abs(A[i])-1] > 0) {
				A[Math.abs(A[i])-1] = -A[Math.abs(A[i])-1];
			} else {
				out[1] = Math.abs(A[i]);
			}
		}
		for(int i=0;i<A.length;i++) {
			if(A[i]>0) {
				out[0]=i+1;
			}
		}
		return out;
	}
}

class Solution1 {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] repeatedNumber(final int[] A) {
        int [] out = new int[2];
        int n=A.length;
        long sumOfSeries= (long)((long)(n*(1+n)))/2;
        long actualSum=0;
        Map mymap = new HashMap();
        
        for(int i=0;i<n;i++){
            actualSum+=(long)A[i];
            if(mymap.get(A[i])!=null){
                out[0]=(int) A[i];
            }else{
                mymap.put(A[i],0);
            }
        }
        out[1]=(int) (sumOfSeries-(actualSum-out[0]));
        return out;
    }
}





