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
		List<Double> result = new ArrayList<Double>();
		for(int i=0;i<results.size();i++) {
			result.add(results.get(i));
		}
		for(int i=1;i<result.size();i++) {
			for(int j=i;j>0;j--) {
				if(result.get(j)<result.get(j-1)) {
					double temp = result.get(j);
					result.remove(j);
					result.add(j, result.get(j-1));
					result.remove(j-1);
					result.add(j-1, temp);
				}
			}
		}
		return result;
	}
	
	public static List<String> sortDNA(List<String> unsequence){
		List<String> sequence = new ArrayList<String>();
		for(int i=0;i<unsequence.size();i++) {
			sequence.add(unsequence.get(i));
		}
		for(int i=1;i<sequence.size();i++) {
			for(int j=i;j>0;j--) {
				if(sequence.get(j).length()<sequence.get(j-1).length()) {
					String temp = sequence.get(j);
					sequence.remove(j);
					sequence.add(j, sequence.get(j-1));
					sequence.remove(j-1);
					sequence.add(j-1, temp);
				}
			}
		}
		return sequence;
	}

	public static List<String> sortWords(List<String> words) {
		// TODO Auto-generated method stub
		List<String> word = new ArrayList<String>();
		for(int i=0;i<words.size();i++) {
			word.add(words.get(i));
		}
		for(int i=1;i<word.size();i++) {
			for(int j=i;j>0;j--) {
				if(word.get(j).compareTo(word.get(j-1))<0) {
					String temp = word.get(j);
					word.remove(j);
					word.add(j, word.get(j-1));
					word.remove(j-1);
					word.add(j-1, temp);
				}
			}
		}
		return word;
	}
}
