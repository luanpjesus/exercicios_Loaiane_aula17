package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		boolean infoValida = false;
		String nome, sexo, estadoCivil;
		int idade;
		double salario;
		

		do {
			System.out.println("Escreva o seu nome :");

			nome = scan.next();

			if (nome.length() >= 3) {
				infoValida = true;
			} else {
				System.out.println("Nome precisa de pelo menos 3 caracteres");
			}

		} while (!infoValida);
		
		//Verificação da IDADE

		infoValida = false;

		do {
			System.out.println("Escreva a sua idade :");

			idade = scan.nextInt();

			if (idade >= 0 && idade <= 150) {
				infoValida = true;
			} else {
				System.out.println("Idade precisa ser entre 0 e 150");
			}

		} while (!infoValida);
		
		//Verificação do Salario

		infoValida = false;

		do {
			System.out.println("Escreva o seu salário :");

			salario = scan.nextDouble();

			if (salario > 0) {
				infoValida = true;
			} else {
				System.out.println("Salario precisa ser maior que zero");
			}

		} while (!infoValida);
		
		//Verificação do Sexo

				infoValida = false;

				do {
					System.out.println("Escreva o seu genero :");

					sexo = scan.next();

					if (sexo.equalsIgnoreCase("f")
							|| sexo.equalsIgnoreCase("m")) {
						infoValida = true;
					} else {
						System.out.println("Valor invalido, digite F ou M");
					}

				} while (!infoValida);
				
				//Verificação do Estado civil

				infoValida = false;

				do {
					System.out.println("Escreva o seu estado civil :");

					estadoCivil = scan.next();

					if (estadoCivil.equalsIgnoreCase("s")
							|| estadoCivil.equalsIgnoreCase("c")
							|| estadoCivil.equalsIgnoreCase("d")
							|| estadoCivil.equalsIgnoreCase("v")) {
						infoValida = true;
					} else {
						System.out.println("Estado civil invalido, digite S, C, D ou V");
					}

				} while (!infoValida);			
				
				
				System.out.println("As informações digitadas foram as seguintes: ");
				System.out.println("Nome: " + nome);
				System.out.println("Idade: " + idade);
				System.out.println("Salario: " + salario);
				System.out.println("Sexo: " + sexo);
				System.out.println("Estado Civil: " + estadoCivil);
				
	}

}
