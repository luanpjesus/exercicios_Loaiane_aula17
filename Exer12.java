package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o numero para gerar a tabuada: ");
		
		int num = scan.nextInt();
		
		System.out.println("Tabuada de " + num + " :");
		
		
		for (int i=1; i<=10; i++) {
			System.out.println(num + " X " + i + " = " + num * i);
		}
	}

}


//Tabuada