package ex5;

import java.util.Scanner;

public class Midia {

	private int codigo;
	private double preco;
	private String nome;
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public Midia() {
		
	}
	
	public Midia (int codigo, double preco, String nome) {
		this.codigo = codigo;
		this.preco = preco;
		this.nome = nome;
	}
	
	public String getTipo() {
		return "Midia:  ";
	}
	
	public String getDetalhes() {
		return "Codigo "+ getCodigo() + " Preço:  "+getPreco() +" Nome:  " + getNome();
		
		}
	
	public void printDados() {
		String s = getTipo() + "\n" + getDetalhes() + "\n";
		System.out.println(s);
	}
	
	//função para leitura de dados via teclado
	public void inserirDadaos() {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o codigo:  ");
		
		int cod = sc.nextInt();
		System.out.println("Digite o preço:  ");
		double prec = sc.nextDouble();
		System.out.println("Digite o nome:  ");
		String no = sc.next();
		
		setCodigo(cod);
		setPreco(prec);
		setNome(no);
		
		
	}
	
	
	
}
