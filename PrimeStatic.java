package com.top.prime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * A PRIME NUMBER  is any number that is divisible by 1 and itself only. 
 * Certain examples of prime numbers are 2, 3, 5, 7, 11 etc. However, 1 is neither a prime nor composite number.
 */

//Solution:1 - using static method.
// 1. need to find the count of factors using for loop.
// 2. prime checking condition using if block.
public class PrimeStatic {
	static void primeChecker(int num) {
		int count=0;
		for(int i = 1; i<=num; i++) {
			System.out.println(i);
			if(num % i == 0 ) {
				count++;
			}
		}
		System.out.println(count);
		if(count == 2) {
			System.out.println(num+ " is a prime number");
		}else {
			System.out.println(num+ " is not a prime");
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number: ");
		int i = Integer.parseInt(br.readLine());
		primeChecker(i);
	}

}
