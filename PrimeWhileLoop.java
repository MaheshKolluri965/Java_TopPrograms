package com.top.prime;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

// Solution 3: using while loop. Here i have used Constructor instead of a method.
/*
 * The while loop iterates until i<=num is false. The remainder of number/i=0 then count will be increased by 1, 
 * “i” value increased by 1. If count=2, then print “number is a prime number”
 * 
 */
public class PrimeWhileLoop {
	
	//Constructor
	PrimeWhileLoop(int num) {	
		int count = 0;
		int i = 1;
		while(i<=num) {
			if(num % i == 0) {
				count++;
			}
			i++;
		}
		if(count == 2) {
			System.out.println(num+" is a prime");
		}else {
			System.out.println(num+" is not a prime");
		}
		
	}
	
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number: ");
		int i = Integer.parseInt(br.readLine());
		br.close();
		
		//Initializing constructor
		new PrimeWhileLoop(i);
		
	}
}
