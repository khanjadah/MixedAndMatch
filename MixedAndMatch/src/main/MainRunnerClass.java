package main;

import java.util.Scanner;

public class MainRunnerClass {
	
	//Scanner helps you take user input.
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please Enter Your Name : ");
		String name = sc.nextLine();
		
		System.out.print("Please enter your Age: ");
		int age = sc.nextInt();
		
		
		System.out.println("**********************");
		System.out.println("My Name is - " + name);
		System.out.println("I am  " + age + "  yrs Old");
		
		
		
	}

}
