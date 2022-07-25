package ex8;

import java.util.Scanner;

public class Moto extends Veiculo{
	
	private int ano;
	
	public Moto() {
		
	}

	public Moto(String modelo,double preco ,int ano) {
		super(modelo, preco);
		this.ano = ano;
	}

	public int getAno() {
		return ano;
	}

	public String getTipo() {
		return "Moto..";
	}
	
	public String getDetalhes() {
		return super.getDetalhes() + "\n" + "Ano da moto:  " + "ano";
	}
	
	public void mostrarDados() {
		String moto = getTipo() + "\n" + getDetalhes();
		System.out.println(moto);
	}
	
	public void inserirDados() {
		super.inserirDados();
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Ano da moto:  ");
		int a = sc.nextInt();
		
		setPreco(a);
		
		
		
		
		
	}
	
	

}
