package com.devhabit.java.algorithms;

/**
 * 
 * 
 */

/**
 * 
 */
public class PrimeNumberTest {


    public static void main(String[] args) {
		
    	int givenNumber = Integer.parseInt(args[0]);

        // Holds the count of values
        int count = 0;

        // There is no prime number less than 2.
        if (givenNumber <= 1) {
          System.out.println("The number is not prime");
          return;
        }

        // Do a for loop
        for (int i = 1; i <= givenNumber / 2; i++) {
          if (givenNumber % i == 0) {
            count++;
          }
        }

        // If the number of factors is greater than 1,
        // the number is not prime.
        if (count > 1) {
            System.out.println("The number is not prime");
        }
        else {
          System.out.println("The number is prime");
        }
	}
 
}
