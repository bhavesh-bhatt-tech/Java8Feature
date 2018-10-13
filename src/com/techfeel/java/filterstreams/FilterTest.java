package com.techfeel.java.filterstreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * The class to test java 8 filters
 * 
 * @author bhavesh bhatt
 *
 */
public class FilterTest {

	// extract even numbers from the given list
	public static void main(String[] args) {

		List<String> numbers = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11");
		List<Integer> evenNos = numbers.stream().map(s -> Integer.valueOf(s)).filter(number -> number % 2 == 0)
				.collect(Collectors.toList());

		System.out.println("Even Numbers = " + evenNos);
		filterString();
	}

	private static void filterString() {
		List<String> cities = new ArrayList<>();
		cities.add("chicago");
		cities.add("newjersy");
		cities.add("newdelhi");
		cities.add("paris");
		cities.add("dubai");
		cities.add("dhaka");
		
		System.out.println("cities starting with letter 'n' ");
		cities.stream().filter(x->x.startsWith("n")).forEach(System.out::println);
		
		System.out.println("cities starting with letter 'd' ");
		cities.stream().filter(x->x.startsWith("d")).forEach(System.out::println);
		
	}
}
