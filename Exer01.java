package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		boolean notaValida = false;
		
		
		do  {
		
			System.out.println("digite uma nota entre 0 e 10 :");
			
			int nota = scan.nextInt();
			
			if(nota >= 0 && nota <= 10) {
				notaValida = true;
				System.out.println("voce digitou :" + nota);
			}else {
				//notaValida = true;
				System.out.println("nota invalida, digite novamente.");
			}
		}while(!notaValida);
		
		
	}

}
