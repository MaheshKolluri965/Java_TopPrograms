package com.top.factorial;

// solution 3: Using Command line arguments
// For command line arguments, click on Run As --> Run COnfiguration --> Arguments --> give your args here.
public class FactorialCmd {
		public static void main(String args[]) {
			int n = 0, fact = 1;
			// This is responsible for cmd line args.
			n = Integer.parseInt(args[0]);
			
			for(int i = 1; i<= n; i++) {
				fact = fact*i;
			}
			System.out.println("Factorial sum = "+fact);
		}
}

/*
 * For checking the cmd arguments.
if (args.length > 0) {
    System.out.println(
        "The command line arguments are:");

    // iterating the args array and printing
    // the command line arguments
    for (String val : args)
        System.out.println(val);
}
else
    System.out.println("No command line "
                       + "arguments found.");
*/
