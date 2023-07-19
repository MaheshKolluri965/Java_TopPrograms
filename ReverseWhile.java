package com.top.reverse_num;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//solution 1: Using while loop
/*
 	example n=153 --> res = (res*10)+ rem
 	the condition is true ,rem=3, res=(0*10)+3=3, num=15
	n=15 condition true, rem=5,res=30+5=35,num=1
	n=1,condition true, rem=1, res=35*10+1=351,num=0, so while loop terminated and prints reverse number.
 */
public class ReverseWhile {
	public ReverseWhile(int num) {
		int rem, res = 0;
		
		while(num != 0) {
			rem = num%10;
			res = (res*10) + rem;
			num = num/10;
		}
		System.out.println(res);		
	}

	public static void main(String args[]) throws IOException {	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number: ");
		int i = Integer.parseInt(br.readLine());
		br.close();
		
		new ReverseWhile(i);
	}
}
