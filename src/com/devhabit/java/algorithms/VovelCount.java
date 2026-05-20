/**
 * 
 */
package com.devhabit.java.algorithms;

/**
 * 
 */
public class VovelCount {// Online Java Compiler
	// Use this editor to write, compile and run your Java code online

	    public static void main(String[] args) {
	    
	        String name = "Bhavesh";
	        char[] vovels = {'a','e','i','o','u'};
	        int vovelCount = 0;
	        int consonentCount=0;
	        char[] nameCharArray = name.toCharArray();
	        for(int i=0;i<nameCharArray.length;i++) {
	            for(int j=0;j<vovels.length;j++) {
	              char charVal = nameCharArray[i];
	              if(charVal == vovels[j]) {
	                  vovelCount++;
	                  break;
	              }   
	            }
	        }
	        consonentCount = nameCharArray.length - vovelCount;
	        System.out.println("Vovel Count = " +vovelCount);
	        System.out.println("consonent Count = "+consonentCount);
	        
	}

}
