package com.top.prime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeRecursion {
	//int i = 1; -- recommended ways are intializing outside the method or as a parameter.
	int primeCheck(int num, int c, int i) {
		//int i = 1;
		// In Recursion intializing the values(updation) inside the method will give you an error, 
		// since in recursion the method will execute on each time, so value will be intialized to same. 
		// so the values which are updating needs to be intialized outside the method.
		if(i<=num) {
			if(num % i == 0) { 
				c++; 
			}
			i++;
			return primeCheck(num,c,i);	
		}
		
		if(c == 2) { 
			System.out.println(num+" is a prime"); 
		}
		else { System.out.println(num+" is not a prime"); }
		return 0;
	}

	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter a number: ");
		int i = Integer.parseInt(br.readLine());
		br.close();
		
		PrimeRecursion pr = new PrimeRecursion();
		pr.primeCheck(i,0,1);
	}
}
