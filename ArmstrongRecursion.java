package com.top.armstrong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//solution 4: using recusrion, Buffer Reader.
public class ArmstrongRecursion {
	
	long armsRecusrsion(long num, long res, int count) {
		//int count=4;
		long rem;
		if(num != 0) {
			rem = num%10;
			res+= (int)(Math.pow(rem, count));
			num/=10;
			//recursion
			return armsRecusrsion(num, res, count);	
		}	
		return res;
	}
	
	public static void main(String[] args) throws IOException {
		ArmstrongRecursion recur = new ArmstrongRecursion();
		
		//using Buffer Reader
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number");
	    int i = Integer.parseInt(in.readLine());
		
		int count = 0;
		int num = i;
		while (num != 0 ) {
			num = num/10;
			count++;
		}
		long result = recur.armsRecusrsion(i, 0, count);
		if(result == i) {
			System.out.println(i +" Armstrong");
		}else {
			System.out.println(result + " not Armstrong");
		}
	}
}
