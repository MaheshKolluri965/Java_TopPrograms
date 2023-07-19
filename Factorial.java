package com.top.factorial;

/*
  A factorial is a function that multiplies number by every number. 
  For example 4!= 4*3*2*1=24. The function is used, among other things, 
  to find the number of ways “n” objects can be arranged.
  eg:
  	4! = 4 x 3 x 2 x 1 = 24. 
  	24 = the arrangement of 4! is {1,2,3,4}, {2,1,3,4}, {2,3,1,4}, {2,3,4,1}, {1,3,2,4}, etc.
 */


public class Factorial {
	public static void main(String args[]) {
		long n = 10, fact = 1;
		for(long i = 1; i<=n; i++) {
			System.out.println(fact+" * "+i+" fact = "+(fact = fact*i));
		}
		System.out.println("factorial sum = "+fact);
	}

}
