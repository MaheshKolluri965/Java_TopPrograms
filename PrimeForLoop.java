package com.top.prime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 1) To find  divisors of the  given number

		- for loop iterates from i=1 to n.
		- If remainder of n,i is 0 then count value increased by 1. Count represents  total no of divisors.
		- if count=2 then the given number is prime.
 */

//solution 4: Using For Loop
public class PrimeForLoop {
	
	void primeCheck(int num) {	
		int count = 0;
		for(int i = 1; i<=num; i++) {
			if(num % i == 0) {
				count++;
			}
		}
		if(count == 2) {
			System.out.println(num+" is a prime");
		}else {
			System.out.println(num+ " is not a prime");
		}
	}
	
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number: ");
		int i = Integer.parseInt(br.readLine());
		br.close();
		
		PrimeForLoop pf = new PrimeForLoop();
		pf.primeCheck(i);
		
	}

}
