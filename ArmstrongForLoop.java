package com.top.armstrong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArmstrongForLoop {
	
	void arms(int start, int end) {

		System.out.println("entered to series: ");
		//iterating series
		for(int num1 = start ; num1 <= end; num1++ ) {
			
			//digit count
			int count = 0;
			int dummy = num1;
			while(dummy != 0) {
				dummy = dummy/10;
				count++;
			}
			
			int rem, res = 0;
			//iterating digits
			for(int num = num1; num != 0; num/=10 ) {
				rem = num%10;
				res+= Math.pow(rem, count);
			}		
			//checking
			int number = num1;
			if (res == number) {
				System.out.println(number+" armstrong");
			}
		}	
	}
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		//series
		ArmstrongForLoop loop = new ArmstrongForLoop();
		loop.arms(1, 1000);
		
		//single number
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number");
	    int num = Integer.parseInt(in.readLine());
		//int num = 1634;
		int num1 = num;
		int num2 = num;
		int rem, count = 0, res=0;

		while(num1 != 0) {
			num1 = num1/10;
			count++;
		}
		for(; num != 0; num/=10 ) {
			rem = num%10;
			res+= Math.pow(rem, count);
		}
		
		if (res == num2) {
			System.out.println(num2+" armstrong");
		}else {
			System.out.println(num2+" not armstrong");
		}
	}
	
}
	
