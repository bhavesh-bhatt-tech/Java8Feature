/**
 * 
 */
package com.devhabit.java.algorithms;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * 
 */
public class FindMinimum {
	
	
	public static void main(String []args) {
		List<Integer> numberList = Arrays.asList(10,12,9,80,27,12);
	
		Integer minimumVal = numberList.stream().min(Integer::compare).get();	
		Optional<Integer> minimumVal2 = numberList.stream().sorted().findFirst();	

		System.out.println("sorting using sorted function: " + minimumVal2);

		System.out.println("Before sorting : " + minimumVal);

		System.out.println("duplicates : " + minimumVal);
		
	}
}
