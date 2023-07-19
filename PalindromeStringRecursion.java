package com.top.palindrome;

//solution 3: Recursive Approach For Palindrome Program in Java

/*
 	The approach is very simple. Just like the two-pointer approach, we will check the first and the last value of the string
 	but this time it will be through recursion.
 	
	- We will take two pointers i pointing to the start of the string and j pointing to the end of the string. 
	- Keep incrementing i and decrementing j while i < j and at every step 
	- Check whether the characters at these pointers are the same or not. We are doing this through recursion – (i+1, j-1
	- If all the characters are the same on the ith and jth index till i>=j condition satisfies, print true else false
 */
public class PalindromeStringRecursion {

	public boolean palindrome(String str) {
		return palindrome(0, str.length()-1, str);
	}
	
	public boolean palindrome(int i, int j, String str) {
		if (i>= j) {
			return true;
		}
		
		if(str.charAt(i) != str.charAt(j)) {
			return false;
		}
		 return palindrome(i+1, j-1, str);
	}
	
	public static void main(String args[]) {
		String str = "Arora";
		str = str.toLowerCase();
		
		
		PalindromeStringRecursion pr = new PalindromeStringRecursion();
		boolean result = pr.palindrome(str);
		System.out.println(result);
	}
	

	
}
