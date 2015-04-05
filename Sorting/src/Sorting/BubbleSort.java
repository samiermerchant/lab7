package Sorting;
public class BubbleSort {
	/**
	 * bubbleSort				sorts an array of integers using bubble sort
	 * 
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] bubbleSort(int[] unsortedArray) {
		int length = unsortedArray.length;
		boolean swapped = true;
		while (swapped) {
			swapped = false;
			for (int x =1; x < length; x++) {
				if (unsortedArray[x-1] > unsortedArray[x]) {
					int temp = unsortedArray[x-1];
					unsortedArray[x-1] = unsortedArray[x];
					unsortedArray[x] = temp;
					swapped = true;
				}
			}
		}		
		return unsortedArray;
	}
}
