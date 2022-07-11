package ex3;

import java.util.Scanner;

public class Corretora {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		String cidade;
		double preco;
		int op;
		
		
		System.out.println("----O QUE DESEJA?----");
		System.out.println("---1- ALUGAR");
		System.out.println("---2- COMPRAR");
		op = sc.nextInt();
		
		if (op == 1) {
			System.out.println("Cidade:  ");
			cidade = sc.next();
			System.out.println("Preço estimado do aluguel: R$  ");
			preco = sc.nextDouble();
			Alugar alugar = new Alugar(preco, cidade);
			alugar.Imprime();
		}else if (op == 2) {
			System.out.println("---1- CASA NOVA");
			System.out.println("---2- CASA VELHA");
			op = sc.nextInt();
		} if (op == 1) {
			System.out.println("Cidade:  ");
			cidade = sc.next();
			System.out.println("Preço estimado do aluguel: R$  ");
			preco = sc.nextDouble();
			Novo novo = new Novo(preco, cidade);
			novo.Imprime();
		} else if (op == 2) {
			System.out.println("Cidade:  ");
			cidade = sc.next();
			System.out.println("Preço estimado do aluguel: R$  ");
			preco = sc.nextDouble();
			Velho velho = new Velho(preco, cidade);
			velho.Imprime();
		}

		
		
	}

}
