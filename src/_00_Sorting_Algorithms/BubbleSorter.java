package _00_Sorting_Algorithms;

public class BubbleSorter extends Sorter{
	public BubbleSorter() {
		type = "Bubble";
	}
	//1. Use the bubble sorting algorithm to sort the array.
	//   You can use display.updateDisplay() to show the current
	//   progress on the graph.
	@Override
	void sort(int[] array, SortingVisualizer display) {
		int count = 0;
		for(int k=0;k<array.length;k++) {
			for(int i=0;i<array.length-1;i++) {
				if(array[i]>array[i+1]) {
					int temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
					display.updateDisplay();
				}
			}
			for(int j=0;j<array.length-1;j++) {
				if(array[j]<array[j+1]) {
					count++;
				}
			}
			if(count==array.length-1) {
				break;
			}
			else {
				count = 0;
			}
		}
	}
}
