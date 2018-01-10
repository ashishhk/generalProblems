import java.util.ArrayList;
import java.util.Scanner;

public class Sorting {

	public static void main(String args[]) {

		int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
		System.out.print("PLease Enter type of Sorting: ");
		CustomSorting sorter = SortingFactory.createSorter(new Scanner(System.in).next());
		if (null == sorter) {
			System.out.println("Invalid Option, please recheck Spelling");
			return;
		}
		sorter.sort(arr);
		sorter.printArray(arr);
		sorter.printAdvice();
	}
}