package com.java.iury;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in); 
		 
		 long primeiro;
		 byte segundo;
		 
		 System.out.println("Enter the first number:");
		 primeiro =  scan.nextInt();
		 
		 System.out.println("Enter the second number:");
		 segundo =  scan.nextByte();
		 
		 int soma = 125 + 24;
		 int sub = 125 - 24;
		 int mult = 125 * 24;
		 int div = 125/24;
		 int mod = 125 % 24;
		 
		 System.out.println("125 + 24 = " + soma);
		 System.out.println("125 - 24 = " + sub);
		 System.out.println("125 x 24 = " + mult);
		 System.out.println("125/24 = " + div);
		 System.out.println("125 mod 24 = " + mod);
		 
		 

	}

}
