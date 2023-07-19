package com.top.factorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FactorialWhile {
	FactorialWhile(int num) {
		int i = 1 , fact = 1;
		
		while(i<=num) {
			fact = fact*i;
			i++;
		}
		System.out.println("Factorial sum: "+fact);
		
	}
	
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number: ");
		int i = Integer.parseInt(br.readLine());
		br.close();
		
		new FactorialWhile(i);
		
	}
}
