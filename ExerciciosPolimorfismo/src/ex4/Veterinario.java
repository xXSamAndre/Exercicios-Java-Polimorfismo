package ex4;

import java.util.Scanner;

public class Veterinario {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nome;
		int op;
		
		
		System.out.println("---BEM VINDO---");
		System.out.println("ESCOLHA A OPÇÃO");
		System.out.println("---1- GATO");
		System.out.println("---2- CACHORRO");
		System.out.println("---3- PASSARO");
		op = sc.nextInt();
		
		if (op == 1 ) {
			System.out.println("Qual o nome do gato:  ");
			nome = sc.next();
			Gato gato = new Gato(nome);
			gato.Imprime();
		} else if (op == 2) {
			System.out.println("Qual o nome do cachoro:  ");
			nome = sc.next();
			Cachorro cachorro = new Cachorro(nome);
			cachorro.Imprime();
		} else if (op == 3 ) {
			System.out.println("Qual o nome do pássaro:  ");
			nome = sc.next();
			Passaro passaro = new Passaro(nome);
			passaro.Imprime();
		}
		

	}

}
