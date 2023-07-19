package com.top.armstrong;

public class Armstrong {
	
	/*
	 * Armstrong Number, also known as Narcissistic Number or a Plus Perfect Number of a given number base
	 *  is a number that is the sum of its own digits each raised to the power of the number of digits.
	 * Armstrong number is a number that is equal to the sum of cubes of its digits. 
	 * For example 0, 1, 153, 370, 371 and 407 are the Armstrong numbers.
	 * 
	 * 153 = (1*1*1)+(5*5*5)+(3*3*3)  = 1 + 125 + 27 = 153
	 * 
	 *
	 */
	
	 public static void main(String[] args) {
		//Solution 1: using while loop
		 int originalNum = 153, dummyNumber, remainder, result = 0; 
		 dummyNumber = originalNum;
		 while (dummyNumber>0) {
			 remainder = dummyNumber % 10;
			 result = result + (remainder * remainder * remainder);
			 dummyNumber = dummyNumber/10;
		 } 
		 if(result == originalNum) {
			 System.out.println( originalNum +" is a Amstrong number");
		 }else {
			 System.out.println(originalNum + " is Not a Amstrong Number");
		 }		 
	 }
}
