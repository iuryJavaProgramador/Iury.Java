package com.java.iury;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int N;
		int t;
		
		System.out.println("Let's calculate your multiplication table!");
		
		System.out.println("Enter a number:");
		N = scan.nextInt();
		
		for(int i=1; i<=10; i++) {
		
			t = N * i;
			System.out.println(N+ " x " + i+ " = " + t);
		}
		
		
		
	}

}
