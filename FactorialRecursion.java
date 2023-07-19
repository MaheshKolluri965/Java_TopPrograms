package com.top.factorial;

//Solution 4: Using Recursion
public class FactorialRecursion {
	int i = 1;
	int factorial(int fact, int num) {	
		if(i<=num) {
			fact = fact*i;
			i++;
			return factorial(fact, num);	
		}
		System.out.println(fact);
		return 0;	
	}
	
	public static void main(String args[]) {
		int i = 5, fact = 1;
		
		FactorialRecursion fr = new FactorialRecursion();
		fr.factorial(fact, i);
	}
}
