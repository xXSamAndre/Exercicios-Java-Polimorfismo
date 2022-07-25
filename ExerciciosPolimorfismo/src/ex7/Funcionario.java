package ex7;

import java.util.Scanner;

public class Funcionario {

	private String nome;
	
	public String getNome() {
		return nome;
	}

	public Funcionario() {
		
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public Funcionario(String nome) {
		this.nome = nome;
	}
	
	public String getDados() {
		return getNome();
	}
	public void mostrarPagamento() {
		System.out.println("O pagamento é:  ");
	}
	
	public void inserirDados() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nome do funcionario:  ");
		String n = sc.next();
		
		setNome(n);
	}
}
