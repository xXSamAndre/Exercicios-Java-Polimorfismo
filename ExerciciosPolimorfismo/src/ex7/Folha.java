package ex7;

import java.util.Scanner;

public class Folha {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int op;
		System.out.println("----FOLHA DE PAGAMENTO----");
		System.out.println("---1- ASSALARIADO");
		System.out.println("---2- HORISTA");
		op = sc.nextInt();
		
		if( op == 1) {
			Assalariado a = new Assalariado();
			a.inserirDados();
			a.getDados();

	} else if (op == 2) {
		Horista h = new Horista();
		h.inserirDados();
		h.getDados();
	}

	}
}
