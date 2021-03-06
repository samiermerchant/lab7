package Sorting;

public class InsertionSort {
	/**
	 * insertionSort			sorts an array of integers using insertion sort
	 * 
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] insertionSort(int[] unsortedArray) {
	    for (int ind = 0; ind < unsortedArray.length; ind++) { 
		for (int check = ind; check > 0; check--) {
	    	    if (unsortedArray[check] < unsortedArray[check-1]) {
			int temp = unsortedArray[check];
               	 	unsortedArray[check] = unsortedArray[check-1];
			unsortedArray[check - 1] = temp;
            	    } else {
                	break;
		    }
		}
	    }
   	    return unsortedArray;	 
		
	}
}
