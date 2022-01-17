package tutorial1;

import java.util.Scanner;

public class tutorial1 {

	public static void main(String[] args) {
		double start_time = System.nanoTime();
		Scanner fact = new Scanner(System.in);
		
		int n;
		System.out.print("Enter n:");
		n = fact.nextInt();
		fact.close();
		
		int factorial = 1;
		
		for (int i=1; i<=n; i++)
		{
			factorial = factorial * i;
		}
		System.out.println("factorial of " +n+ " is " + factorial);
		
		
		double time_elapsed = (System.nanoTime() - start_time)/1000000000;
		System.out.println("elapsed time is: "+ time_elapsed);
	}

}
