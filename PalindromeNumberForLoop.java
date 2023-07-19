package com.top.palindrome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://javatutoring.com/palindrome-program-in-java/
/*
 	A Palindrome is a sequence of words, digits or other symbols that reads the same both forwards and backwards.
	There are several examples such as RACECAR, MOM, 12321 etc.
 */
// Note: new type of declaration in for loop.

//Solution 1: Using For loop --> it is extension to the reverse number but after reversing also number should be same.
public class PalindromeNumberForLoop {
	public void palindrome(int num) {
		int rem, res, original = num;
		for(res = 0; num>0; num/=10) {
			rem = num%10;
			res = (res*10)+rem;
		}
	
		if(res == original) {
			System.out.println(original +" is a palindrome");
		}else {
			System.out.println(original +" is not a palindrome");
		}
	}
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number: ");
		int i = Integer.parseInt(br.readLine());
		br.close();
		
		PalindromeNumberForLoop pf = new PalindromeNumberForLoop();
		pf.palindrome(i);
	}
	
}
