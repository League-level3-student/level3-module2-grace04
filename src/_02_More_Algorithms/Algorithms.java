package _02_More_Algorithms;

import java.util.ArrayList;
import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for(int i=0;i<eggs.size();i++) {
			if(eggs.get(i).equals("cracked"))
				return i;
		}
		return -1;
	}
	
	public static int countPearls(List<Boolean> oysters) {
		int count = 0;
		for(Boolean boo : oysters) {
			if(boo)
				count++;
		}
		return count;
	}
	
	public static double findTallest(List<Double> peeps) {
		double tallest = peeps.get(0);
		for(Double dou : peeps) {
			if(dou>tallest)
				tallest = dou;
		}
		return tallest;
	}
	
	public static String findLongestWord(List<String> words) {
		String longest = words.get(0);
		for(String str : words) {
			if(str.length()>longest.length())
				longest = str;
		}
		return longest;
	}
	
	public static boolean containsSOS(List<String> message) {
		for(String str : message) {
			if(str.equals("... --- ..."))
				return true;
		}
		return false;
	}

	public static List<Double> sortScores(List<Double> results) {
		List<Double> sorted = new ArrayList<Double>(results.size());
		double smallest = results.get(0);
		int ind = 0;
		while(results.size()>0) {
			sorted.add(smallest);
			results.remove(ind);
			for(int i=0;i<results.size();i++) {
				if(results.get(i)<smallest) {
					smallest = results.get(i);
					ind = i;
				}
			}
		}
		return sorted;
	}
}
