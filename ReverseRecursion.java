package com.top.reverse_num;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseRecursion {
	int res = 0; 
	// here res will update each time the method is called but rem remains same. since for rem the assignment is res= num%10; which is 
	// with in the method and no need to store this value.
	public int reverse(int num) {
		int rem;
		if(num!=0) {
			rem = num % 10;
			res = (res*10)+rem;
			num/=10;
			return reverse(num);
		}
		System.out.println(res);
		return 0;
		
	}
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number: ");
		int i = Integer.parseInt(br.readLine());
		br.close();
		
		ReverseRecursion rr = new ReverseRecursion();
		rr.reverse(i);
	}

}
