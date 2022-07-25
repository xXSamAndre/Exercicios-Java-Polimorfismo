package ex8;

import java.util.Scanner;

public class Veiculo {

	private String modelo;
	private double preco;
	
	public Veiculo() {
		
	}

	public Veiculo(String modelo, double preco) {
		this.modelo = modelo;
		this.preco = preco;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public String getTipo() {
		return "Veiculo...";
	}
	
	public String getDetalhes() {
		return "Veiculo..." + getModelo() + "custa R$ " + getPreco();
 	}
	
	public void mostrarDados() {
		String mostrar = getTipo() + "\n" + getDetalhes();
		System.out.println(mostrar);
	}
	
	public void inserirDados() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Modelo do veiculo ");
		String vei = sc.next();
		System.out.println("Valor:  ");
		double val = sc.nextDouble();
		
		setModelo(vei);
		setPreco(val);
	}
	
	
}
