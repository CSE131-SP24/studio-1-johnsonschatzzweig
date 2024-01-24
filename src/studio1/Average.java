package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("First number to be averaged?");
		int x = in.nextInt();
		System.out.println("Second number to be averaged?");
		int y = in.nextInt();
		double a = (x + y) / 2.0;
		System.out.println("The average is " + a + ".");
	}}
	