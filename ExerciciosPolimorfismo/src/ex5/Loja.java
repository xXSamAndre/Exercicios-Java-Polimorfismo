package ex5;

import java.util.Scanner;

public class Loja {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		Midia[] lista = new Midia[10];
		int op;
		
		for (int i = 0; i < 2; i++) {
			System.out.println("--------");
			System.out.println("-1- CD");
			System.out.println("-2- DVD");
			op = sc.nextInt();
			
			if (op == 1) {
				lista[i] = new CD();
			} else if (op == 2) {
				lista[i] = new DVD();
			}
			
			lista[i].inserirDadaos();
			
		}
		
		for (int j = 0; j < 2; j++) {
			lista[j].printDados();
		}
		
		
	}

}
