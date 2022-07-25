package ex5;

import java.util.Scanner;

public class DVD extends Midia{

	private int faixas;
	
	public DVD() {
		super();	
	}

	public DVD(int codigo, double preco, String nome, int faixas) {
		super(codigo, preco, nome);
		this.faixas = faixas;
		
	}
	
	public String getTipo() {
		return "DVD:  ";
	}
	
	public String getDetalhes() {
		return super.getDetalhes() + "\n" + "Número de faixas:  " + faixas;
	}

	public void setFaixas(int fai) {
		faixas = (fai > 0 ) ? fai : 0;
	}
	
	//função para leitura de dados do teclado
	public void inserirDados() {
		super.inserirDadaos();
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o numero de faixas:  ");
		int fai = sc.nextInt();
		
		setFaixas(fai);
	}
	
	
}
