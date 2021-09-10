package com.loiane.cursojava.aula17;

public class Exer04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int popA = 50000;
		int popB = 200000;
		int cont = 0;
		
		while(popA < popB) {
			
			popA += (popA / 100 * 3);
			popB += (popB / 100 * 1.5);
			cont++;
		}
		System.out.println("População A : " + popA);
		System.out.println("População B : " + popB);
		System.out.println("Qtd anos : " + cont);
	}

}
