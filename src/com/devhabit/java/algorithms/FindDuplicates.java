/**
 * 
 */
package com.devhabit.java.algorithms;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 */
public class FindDuplicates {
	
	public static void main(String[] args) {
		List<String> nameList = Arrays.asList("Vihan","Nirav","Vikas","Abhinav","Nirav");
		HashSet uniqueItems = new HashSet();
		
		List<Boolean> nonDuplicateList = nameList.stream().map(t->!uniqueItems.add(t)).toList();
		System.out.print("now printing the boolean if the element present \n");
		
		nonDuplicateList.forEach(System.out::println);
		nameList.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);
		
		System.out.print("now printing the duplicate \n");
		
		nameList.stream().filter(t->Collections.frequency(nameList, t)>1)
		.collect(Collectors.toSet()).forEach(System.out::println);
	}
}
