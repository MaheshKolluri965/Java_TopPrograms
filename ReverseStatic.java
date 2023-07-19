package com.top.reverse_num;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//solution 2: using static method
public class ReverseStatic {
	static void reverse(int num) {
		int rem, res=0;
		while(num!=0) {
			rem = num%10;
			res = (res*10)+rem;
			num/=10;
		}
		System.out.println(res);	
	}
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number: ");
		int i = Integer.parseInt(br.readLine());
		br.close();
		
		reverse(i);
		
	}
}
