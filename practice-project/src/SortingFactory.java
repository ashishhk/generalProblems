
public class SortingFactory {

	public static CustomSorting createSorter(String typeOfSorting) {
		typeOfSorting=typeOfSorting.toUpperCase();
		switch (typeOfSorting) {
		case "BUBBLE":
			return new BubbleSort();
		case "INSERTION":
			return new InsertionSort();
		case "INSERTIONREC":
			return new InsertionRecSort();
		case "SELECTION":
			return new SelectionSort();
		case "MERGE":
			return new MergeSort();
		default:
			return null;
		}
	}
}
