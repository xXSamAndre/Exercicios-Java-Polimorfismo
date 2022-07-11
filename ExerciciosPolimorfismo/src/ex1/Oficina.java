package ex1;

import java.util.Scanner;

public class Oficina {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    Veiculo v;
	    
	    
		System.out.println("----Escolha o veiculo----");
		System.out.println("---1- Bicicleta");
		System.out.println("---2-Automovel");
		
		for (int i = 0; i<4; i++) {
			int op = sc.nextInt();
		 
			if (op == 1) {
				v = new Bicicleta();
				v.checagem();
				v.ajuste();
				v.limpesa();
			} else if (op == 2) {
				v = new Automovel();
				v.checagem();
				v.ajuste();
				v.limpesa();
			}
			
		}
		
		
	}
		
		
	    

	}

	
	

