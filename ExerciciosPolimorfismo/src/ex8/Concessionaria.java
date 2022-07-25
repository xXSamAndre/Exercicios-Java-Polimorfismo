package ex8;

import java.util.Scanner;

public class Concessionaria {

	public static void main(String[] args) {
	
		Scanner sc =  new Scanner (System.in);
		
		int op;
		
		System.out.println("--- O QUE DESSEJA ---");
		System.out.println("---1- MOTO");
		System.out.println("---2- CARRO");
		op = sc.nextInt();
		
		if (op == 1) {
			Moto moto = new Moto();
			moto.inserirDados();
			moto.mostrarDados();
		} else if (op == 2) {
			Carro carro = new Carro();
			carro.inserirDados();
			carro.mostrarDados();
		}
		
		
		
		
		
		
	}

}
