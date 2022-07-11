package ex2;

import java.util.Scanner;

public class CadastroPessoa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		String nome, sobrenome, CPF; //Pessoa Fisica;
		String razaoSocial, nomeFantasia, CNPJ, sigla; // Pessoa Juridica;
		String pais, dataCadastro; //Cliente;
		int op = sc.nextInt();
		
		System.out.println("---CADASTRO DE PESSOAS---");
		System.out.println("---1- PESSOA FISICA");
		System.out.println("---2- PESSOA JURIDICA");
		op = sc.nextInt();
		
		if (op == 1) {
			System.out.println("País:   ");
			pais = sc.next();
			System.out.println("Data do Cadastro:  ");
			dataCadastro = sc.next();
			System.out.println("Nome Completo:  ");
			nome = sc.next();
			sobrenome = sc.next();
			System.out.println("CPF:");
			CPF = sc.next();
			PessoaFisica pf = new PessoaFisica(pais, dataCadastro, nome, sobrenome, CPF);
			pf.Imprime();
			} else if (op == 2 ) {
			System.out.print("País:   ");
			pais = sc.next();
			System.out.print("Data do Cadastro:  ");
			dataCadastro = sc.next();
			System.out.print("Razão Social:  ");
			razaoSocial = sc.next();
			System.out.print("Nome Fantasia:  ");
			nomeFantasia = sc.next();
			System.out.print("Sigla:  ");
			sigla = sc.next();
			System.out.print("CNPJ:  ");
			CNPJ = sc.next();
			PessoaJuridica pj = new PessoaJuridica(pais, dataCadastro, razaoSocial, nomeFantasia, sigla, CNPJ);
			pj.Imprime();
		
		
		
		
		
			}
	}
       

	
	

}
