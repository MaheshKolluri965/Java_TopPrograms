package com.top.palindrome;
// https://www.geeksforgeeks.org/java-program-to-check-whether-a-string-is-a-palindrome/
/*
 	- Get the number to check for palindrome
	- Hold the number in temporary variable
	- Reverse the number
	- Compare the temporary number with reversed number
	- If both numbers are same, print "palindrome number"
	- Else print "not palindrome number"
 */
//1. Naive Approach to Check Palindrome String  in Java --> By Reversing the given string and Comparing. 
// We can check if the given string is a palindrome by comparing the original string with its reversed version.

public class PalindromeStringForLoop {
	public static void main(String args[]) {
		String str = "Arora";
		String rev = "";
		
		for (int i = str.length()-1; i>=0; i--) {
			rev = rev+str.charAt(i);
		}
		
		if(str.equalsIgnoreCase(rev)) {
			System.out.println(str + " is a palindrome");
		}else {
			System.out.println(rev + " is not a palindrome");
		}
				
	}

}
