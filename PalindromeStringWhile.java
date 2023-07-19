package com.top.palindrome;

public class PalindromeStringWhile {
	
	String palindrome(String str, String rev) {
		int length = str.length()-1;
		while(length>=0) {
			rev = rev + str.charAt(length);
			length--;
		}
		return rev;
	}
	
	public static void main(String args[]) {
		String str = "saippuakivikauppias";
		String rev = "";
		
		PalindromeStringWhile pw = new PalindromeStringWhile();
		String result = pw.palindrome(str, rev);
		if(str.equalsIgnoreCase(result)) {
			System.out.println(str+" is a palindrome");
		}
		else {
			System.out.println(str+" is not a palindrome");
		}
	}

}
