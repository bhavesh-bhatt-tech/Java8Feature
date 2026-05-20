/**
 * 
 */
package com.devhabit.java.algorithms;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * 
 */
public class Anagram {
	
	


	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner item = new Scanner(System.in);
		String[] inputArray = {"ate","eat","tea","tan","nat","bat"};
		List<String> inputList = Arrays.asList(inputArray);
		 
		inputList.stream().collect(Collectors.groupingBy(word -> {
			char[] chars = word.toCharArray();
            Arrays.sort(chars);
            return new String(chars);
		})).values().stream().collect(Collectors.toList()).forEach(System.out :: println);
		
	}
}
