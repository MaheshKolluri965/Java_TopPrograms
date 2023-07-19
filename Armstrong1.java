package com.top.armstrong;
import java.util.Scanner;

//solution 2: using static method or any own method. here i have used count since based on the no of digits, it will be mulitply.
//Definition: Armstrong Number, also known as Narcissistic Number or a Plus Perfect Number of a given number base
//is a number that is the sum of its own digits each raised to the power of the number of digits.
// if the number is 1634, which is having 4 digits,then you need to make the power as 4.so 1*1*1* + 6*6*6*6 + 3*3*3*3 + 4*4*4*4 = 1634.
// if 5 digits then power will be 5.

public class Armstrong1 {
	static void armstrongResult(int originalNum) {		
	
		int num1 = originalNum, count=0;	
		while(num1!=0) {
			num1 = num1/10; 
			count++;
		}
		System.out.println("count: "+count);
		
		int num, rem, res=0;
		num = originalNum;
		while(num != 0) {
			rem = num % 10;
			res = (int) (res + Math.pow(rem, count));
			num = num/10;
		}
		
		
		if(originalNum == res) System.out.println( originalNum +" is a Amstrong1 number");
		else System.out.println(originalNum + " is Not a Amstrong1 Number");		
	}
	
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		System.out.println("number: ");
		int original = sc.nextInt();
		sc.close();
		Armstrong1.armstrongResult(original);
	}
}
