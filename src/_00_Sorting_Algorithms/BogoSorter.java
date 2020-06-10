package _00_Sorting_Algorithms;

import java.util.Random;

public class BogoSorter extends Sorter {
	public BogoSorter() {
		type = "Bogo";
	}
	
	// Bogo sort is a joke sorting algorithm. It is considered the most 
	// inefficient sorting algorithm while still maintaining the possibility
	// of eventually sorting data.
	
	// It works by following these steps:
	// STEP 1. Is the array in order?
	//	if yes, finished; if no, go to step 2.
	// STEP 2. Take two random elements in the array and swap them.
	// STEP 3. Go back to step 1.
	
	//1. Complete the sort method using the Bogo sort algorithm. 
	@Override
	void sort(int[] array, SortingVisualizer display) {
		Random gen = new Random();
		int count = 0;
		int temp;
		int i;
		int j;
		while(count==0) {
			for(int k=0;k<array.length-1;k++) {
				if(array[k]<array[k+1]) {
					count++;
				}
			}
			if(count==array.length-1) {
				break;
			}
			else {
				display.updateDisplay();
				count = 0;
				i = gen.nextInt(array.length);
				j = gen.nextInt(array.length);
				temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
	}
}
