package tut2;
import java.util.Scanner;

public class tut2 {

	public static void main(String[] args) {
		Scanner mark = new Scanner (System.in);
		
		System.out.print("Enter the 3 assignments and 2 exams respectively: ");
		
		float ass1 = mark.nextFloat();
		float ass2 = mark.nextFloat();
		float ass3 = mark.nextFloat();
		float ex1 = mark.nextFloat();
		float ex2 = mark.nextFloat();
		float average = 0;
		
		
		if (ass1 > 100 || ass2 > 100 || ass3 > 100 || ex1 > 100 || ex2 > 100) {
			System.out.print("values are more than 100, please enter the marks again");
		}
		else {
			average = (float) (ass1 * 0.1 + ass2 * 0.1 + ass3 * 0.1 + ex1 * 0.35 + ex2 * 0.35);
			System.out.println("Average is: " + average);
		}
		}
	}
