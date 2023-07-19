package com.top.palindrome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// solution 2: Two Pointer Approach for Palindrome Program in Java
public class PalindromeStringPointers {

	static boolean palindrome(String str) {
		int i = 0;
		int j = str.length()-1;
		
		while(i<j) {
			if(str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a String: ");
		String str = br.readLine();	
		str = str.toLowerCase();
		
		//boolean result = palindrome(str);
		
		if(palindrome(str)) {
			System.out.println(str+" palindrome");
		}else {
			System.out.println(str+" not palindrome");
		}
	}

}
