/**
 * 
 */
package com.devhabit.java.algorithms;

import java.util.Arrays;
import java.util.List;

/**
 * 
 */
public class FindMinimum {
	
	
	public static void main(String []args) {
		List<Integer> numberList = Arrays.asList(10,12,9,80,27,12);
		Integer minimumVal = numberList.stream().min(Integer::compare).get();	
		System.out.println("Before sorting : " + minimumVal);
	}
}
