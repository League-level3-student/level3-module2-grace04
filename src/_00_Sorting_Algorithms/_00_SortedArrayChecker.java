package _00_Sorting_Algorithms;

public class _00_SortedArrayChecker {
	//1. Write a static method called intArraySorted. 
	//   This method takes in an array of integers
	//   and it returns a boolean.
	//   The method returns true if the integer
	//   array is in ascending order and false otherwise
	public static boolean intArraySorted(int[] parray) {
		int goal = 0;
		for(int i=0;i<parray.length-1;i++) {
			if(parray[i]<=parray[i+1]) {
				goal++;
			}
		}
		if(goal==parray.length-1) {
			return true;
		}
		return false;
	}
	
	//2. Write a static method called doubleArraySorted. 
	//   This method takes in an array of doubles
	//   and it returns a boolean.
	//   The method returns true if the double
	//   array is in ascending order and false otherwise
	public static boolean doubleArraySorted(double[] parray) {
		int goal = 0;
		for(int i=0;i<parray.length-1;i++) {
			if(parray[i]<=parray[i+1]) {
				goal++;
			}
		}
		if(goal==parray.length-1) {
			return true;
		}
		return false;
	}
	
	//3. Write a static method called charArraySorted. 
	//   This method takes in an array of characters
	//   and it returns a boolean.
	//   The method returns true if the character
	//   array is in alphabetical order and false otherwise
	//   (You can compare characters just like integers)
	public static boolean charArraySorted(char[] parray) {
		int goal = 0;
		for(int i=0;i<parray.length-1;i++) {
			if(parray[i]<parray[i+1]) {
				goal++;
			}
		}
		if(goal==parray.length-1) {
			return true;
		}
		return false;
	}
	
	//4. Write a static method called stringArraySorted. 
	//   This method takes in an array of Strings
	//   and it returns a boolean.
	//   The method returns true if the String
	//   array is in alphabetical order and false otherwise
	//   (Use the compareTo(String) method)
	public static boolean stringArraySorted(String[] parray) {
		int goal = 0;
		for(int i=0;i<parray.length-1;i++) {
			if(parray[i].compareTo(parray[i+1])<0) {
				goal++;
			}
		}
		if(goal==parray.length-1) {
			return true;
		}
		return false;
	}
}
