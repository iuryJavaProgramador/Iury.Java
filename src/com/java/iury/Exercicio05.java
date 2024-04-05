package com.java.iury;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		 
		 Scanner ler = new Scanner(System.in); 
		 
		 int valor1 = 25;
		 byte valor2 = 5;
		 
		 System.out.println("Entre com o primeiro valor:");
		 valor1 =  ler.nextInt();
		 
		 System.out.println("Entre com o segundo valor:");
		 valor2 =  ler.nextByte();
		 
		 int mult = valor1 * valor2;
		 
		 System.out.println("25 x 5 = " + mult);
	}

}
