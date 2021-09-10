package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double popA;
		double popB;
		double taxaA;
		double taxaB;

		boolean valido = false;

		// ## Popula��o A
		do {

			System.out.println("Entre com a popula��o A :");
			popA = scan.nextDouble();
			if (popA > 0) {
				valido = true;
			} else {
				System.out.println("Popula��o A invalida");
			}

		} while (!valido);

		// ## Popula��o B
		valido = false;

		do {

			System.out.println("Entre com a popula��o B :");
			popB = scan.nextDouble();
			if (popB > 0) {
				valido = true;
			} else {
				System.out.println("Popula��o B invalida");
			}

		} while (!valido);

		// ## Taxa de crescimento Popula��o A
		
		valido = false;

		do {

			System.out.println("Entre com a taxa da popula��o A :");
			taxaA = scan.nextDouble();
			if (taxaA > 0) {
				valido = true;
			} else {
				System.out.println("Taxa de crescimento da Popula��o A invalida");
			}

		} while (!valido);
		
		// ## Taxa de crescimento Popula��o B
		
				valido = false;

				do {

					System.out.println("Entre com a taxa da popula��o B :");
					taxaB = scan.nextDouble();
					if (taxaB > 0) {
						valido = true;
					} else {
						System.out.println("Taxa de crescimento da Popula��o B invalida");
					}

				} while (!valido);
				
				int cont = 0;
				
				while(popA < popB) {
					
					popA += (popA / 100 * taxaA);
					popB += (popB / 100 * taxaB);
					cont++;
				}
				System.out.println("Popula��o A : " + popA);
				System.out.println("Popula��o B : " + popB);
				System.out.println("Qtd anos : " + cont);

	}

}
