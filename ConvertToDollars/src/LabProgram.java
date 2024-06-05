/*
Author: Jennifer Vo
Course: COP 2210
Date: 05/18/2024
Assignment: Hello World assignment
Instructor: Sergio Pisano
Description: Converting to dollars.
*/

import java.util.Scanner;
public class LabProgram {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		double dollars;
		double numNickels;
		double numDimes;
		double numQuaters;
		
		numNickels = scnr.nextDouble();
		numDimes = scnr.nextDouble();
		numQuaters = scnr.nextDouble();
		
		dollars = ((numQuaters * 25) + (numDimes * 10) + (numNickels * 5)) / 100;
		
		System.out.printf("Amount: $%.2f\n", dollars);

	}

}

/* CODE FROM OUTPUT
3 1 4
Amount: $1.25
*/