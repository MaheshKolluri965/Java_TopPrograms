package com.top.prime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// solution 2: Prime number series
public class PrimeSeries {
	
	//method for series
	void primeNumSeries(int start, int end) {
		//iterate from start to end. eg: start= 1 to end = 100.
		
		for(;start<=end;start++) {
			int count = 0;
			//for loop for count
			for(int i = 1; i<= start; i++) {
				if(start % i == 0) {
					count++;
				}
			}
			//condition for prime check
			if(count == 2) {
				System.out.print(start+" ");
			}
		}		
	}
	
	public static void main(String args[]) throws IOException {
		//reading input values
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter start: ");
		int start = Integer.parseInt(br.readLine());
		System.out.println("Enter end: ");
		int end = Integer.parseInt(br.readLine());
		br.close();
		
		//method calling
		PrimeSeries ps = new PrimeSeries();
		ps.primeNumSeries(start, end);
	}

}
