package com.top.factorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


//Solution 2: Using For Loop
public class FactorialForLoop {
	
	void Factorial(int num) {
		int fact = 1;
		for(int i = 1; i<=num; i++) {
			fact = fact*i;
		}
		System.out.println("factorial sum = "+fact);
	}
	
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number: ");
		int i = Integer.parseInt(br.readLine());
		br.close();
		
		FactorialForLoop ff = new FactorialForLoop();
		ff.Factorial(i);
	}

}
