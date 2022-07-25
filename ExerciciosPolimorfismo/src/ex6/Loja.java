package ex6;

import java.util.Scanner;

public class Loja {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int op;
		
		System.out.println("SELECIONE UM TIPO DE ARQUIVO");
		System.out.println("1 - MP3");
		System.out.println("2 - MP4");
		op = sc.nextInt();
		
		if (op == 1) {
			MP3 MP3 = new MP3();
			MP3.inserirDados();
			MP3.Imprime();
		} else if (op == 2) {
			MP4 MP4 = new MP4();
			MP4.InserirDados();
			MP4.Imprime();
		}
		
		
		
		

	}

}
