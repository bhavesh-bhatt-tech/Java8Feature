/**
 * 
 */
package com.devhabit.java.filterstreams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Find out the total value of the orders having value greater than 2000 from the given list 
 */
public class OrderValueTest {
	
	/**
	 * 
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String[] orderValues = {"1000","2000","3000","4500","660","840"};
		
		List<String> orderValueList = Arrays.asList(orderValues);
		int totalOrderVal = orderValueList.stream().mapToInt(Integer :: parseInt).filter(t-> t > 2000).sum();
		System.out.print(totalOrderVal);
	}
}
