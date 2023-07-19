package com.top.armstrong;
import java.util.Scanner;

//solution 3: Series
//Armstrong Number, also known as Narcissistic Number or a Plus Perfect Number of a given number base
//is a number that is the sum of its own digits each raised to the power of the number of digits.
public class ArmstrongSeries {
	
	int armNumber(int num){		
		//Initialization
		int num1;
		int rem, res=0, count=0, num2=num1= num;
		//count
		while(num1 != 0) {
			num1/=10;
			count++;
		}
		//calculations
		while(num2 != 0) {
			rem = num2%10;
			res = (int) (res + Math.pow(rem, count));
			num2 = num2/10;
		}
		//checking for Armstrong
		if(res == num) {
			System.out.println(num+" is a armstrong number");;
		}
		return 0;
	}
	
	public static void main(String[] args) {
		ArmstrongSeries armSeries = new ArmstrongSeries();
		int i =1634;
		armSeries.armNumber(i);
		
		//series
		Scanner sc = new Scanner(System.in);
		System.out.println("enter start: ");
		int start = sc.nextInt();
		System.out.println("enter end: ");
		int end = sc.nextInt();
		sc.close();
		
		System.out.println("Armstrong Number series between "+start+"and "+ end+" is: ");
		while(start < end ) {
			armSeries.armNumber(start);
			start++;
		}	
	}
}


/* 
 * if want to remove 2,3,4 ... 9 use this 
 
	int armNumber(int num){		
		int num1, num3;
		int rem, res=0, count=0, num2=num1=num3= num;
		//count
		while(num1 != 0) {
			num1/=10;
			count++;
		}
		
		//calculations
		while(num2 !=0 && count>2) {
			rem = num2%10;
			res = (int) (res + Math.pow(rem, count));
			num2 = num2/10;
		}
		//checking for armstrong
		if(num == 0 || num == 1) {
			System.out.println(num +" is a armstrong number");
		}
		else if(res == num) {
			System.out.println(num+" is a armstrong number");
		}
		return 0;
	}
*/