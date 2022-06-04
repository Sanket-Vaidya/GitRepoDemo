package Inheritance;

import java.util.Scanner;

public class D {
public static void main(String[] args) {
	
int pindb=1234;
int tries=0;
		

		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter your Pin");
		int userPin=scan.nextInt();
		
		while(userPin!=pindb) {
			System.out.println("Pin entered is incorrect");
		 userPin=scan.nextInt();
		}
		
		System.out.println("Welcome!");
		
	}

}
