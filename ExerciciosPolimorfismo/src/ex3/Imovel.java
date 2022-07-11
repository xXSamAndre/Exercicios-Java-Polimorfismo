package ex3;

public class Imovel {

	private double preco;
	private String cidade;
	
	public Imovel (double preco, String cidade) {
		this.preco = preco;
		this.cidade = cidade;
	}
	
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getCidade() {
		return cidade;
	}
	
	
	public void Imprime() {
		System.out.println("Cidade:  "+this.cidade);
		
	}
	
	
	
}
