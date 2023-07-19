package com.top.factorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FactorialDoWhile {

	public FactorialDoWhile(int num) {
		int i = 1, fact = 1;
		do{
			fact = fact*i;
			i++;
		}while(i<=num);
		
		System.out.println("Factorial sum = "+fact);	
	}
	
	public static void main(String args[]) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("Enter a number: ");
		 int i = Integer.parseInt(br.readLine());
		 br.close();
		 
		 new FactorialDoWhile(i);
	}

}
